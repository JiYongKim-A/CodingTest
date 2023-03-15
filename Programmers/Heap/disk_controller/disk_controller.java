
import java.util.*;

class Solution {
    // 시간복잡도 O(n^2) ... n = jobs.length
    public int solution(int[][] jobs) {
        ArrayList<Job> list = new ArrayList<>();
        Queue<Job> workFlow = new LinkedList<>();

        // jobs의 요소를 job객체로 만들어 List에 넣고 요청된 시간 순으로 정렬 [만약 요청된 시간이 동일하다면 처리되는 시간이 적은 순으로 정렬]
        for (int i = 0; i < jobs.length; i++) {
            list.add(new Job(jobs[i][0], jobs[i][1]));
        }
        Collections.sort(list, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                if (o1.getRequestTime() - o2.getRequestTime() == 0) {
                    return o1.getTakenTime() - o2.getTakenTime();
                }
                return o1.getRequestTime() - o2.getRequestTime();
            }
        });

        // 작업이 진행될 순서 결정
        int listSize = list.size();
        int time = 0;
        for (int i = 0; i < listSize; i++) {
            if (i == 0) { // 가장 처음 요청된 작업을 작업순서큐에 삽입
                workFlow.add(list.get(0));
                time += list.get(0).requestTime + list.get(0).takenTime;
                list.remove(0);
            } else {
                int min = 1001;
                int index = 0; // 작업 처리가 가장 적게 걸리는 작업의 인덱스 번호
                int indexCount = 0; // 순환에 필요한 증가되는 인덱스 번호
                for (Job job : list) {
                    // 하나의 작업이 종료되는 시간내에 요청된 작업중 처리되는데 가장 적게 걸리는 작업 찾기
                    if (min > job.takenTime && job.requestTime <= time) {
                        index = indexCount;
                        min = job.takenTime;
                    }
                    indexCount++;
                }

                //요청된 시간이 이전 작업 종료 시간보다 이후일 경우 그 차이 시간을 현재 시간에 추가
                if (time < list.get(index).requestTime) {
                    time = list.get(index).requestTime;
                } else {
                    time += list.get(index).takenTime;
                }
                // 찾은 작업을 작업 순서큐에 삽입
                workFlow.add(list.get(index));
                list.remove(index);
            }
        }


        // 작업 평균 시간 구하기
        int sum = 0; // 각 작업의 요청부터 종료까지 걸린 시간의 합
        int finishTime = 0; // 작업이 진행될때 마다 추적되는 시간
        for (int i = 0; i < listSize; i++) {
            if (i == 0) {
                // 쳣번째 진행 작업
                Job j = workFlow.poll();
                finishTime += j.requestTime + j.takenTime;
                sum += finishTime - j.requestTime;
            } else {
                Job j = workFlow.poll();

                // 요청된 시간이 이전 작업 종료 시간보다 이후일 경우 그 차이 시간을 현재 시간에 추가
                if (j.requestTime > finishTime) {
                    finishTime = j.requestTime;
                }
                // 작업의 요청부터 종료까지 걸린 시간 : 이전 작업이 종료된 시간 + 작업 처리에 걸리는 시간 - 요청된 시간
                sum += finishTime + j.takenTime - j.requestTime;
                finishTime += j.takenTime;
            }
        }
        return sum / listSize;
    }
}

class Job {
    int requestTime;

    int takenTime;

    Job(int requestTime, int takenTime) {
        this.requestTime = requestTime;
        this.takenTime = takenTime;
    }

    public int getRequestTime() {
        return requestTime;
    }

    public int getTakenTime() {
        return takenTime;
    }
}