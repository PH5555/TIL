# 선택정렬 알고리즘

'제일 작은 수를 선택해서 앞으로 계속보내면 정렬되지 않을까?'

1. 제일 작은 수를 찾는다
2. 맨 앞의 수와 제일 작은 수를 바꾼다
3. 맨 앞의 수는 정렬 되었으므로 맨 앞을 제외하고 제일 작은 수를 찾는다
4. 과정 반복

```c

#include <stdio.h>

int main(){
	int i, j, index, min, temp;
	int num[10] = {5, 4, 9, -8, 4, 50, 12, 45, 11, 10};
	
	for(i = 0; i < 10; i++){
		min = num[i];
		for(j = i ; j < 10; j++){
			if(min > num[j]){
				min = num[j];
				index = j;
			}
		}
		if(min != num[i]){
			temp = num[i];
			num[i] = min;
			num[index] = temp;
		}
	}
	for(i = 0; i < 10; i++){
		printf("%d ",num[i]);
	}
}

```

# 시간 복잡도

경우의 수는 N * (N - 1) / 2 이다

빅오표기법으로 하면 -1 이나 /2 같은것은 수에 별 영향을 안 미치기 때문에 제외해서

O(N * N)이 된다.
