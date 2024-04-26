#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int n) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* answer = (int*)calloc(n * (n+1) / 2, sizeof(int));
    int state = 0, index = 0, count = 1;

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n - i; j++) {
            if(state%3 == 0) {
                index = index - state/3 + i + j;
            } else if (state%3 == 1){
                index++;
            } else {
                index = index - n + state/3 + j;
            }
            answer[index] = count++;
        }
        state++;
    }
    return answer;
}