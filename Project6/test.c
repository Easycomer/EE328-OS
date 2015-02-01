#include <linux/unistd.h>
#define __NR_perf 297
#include <stdio.h>
int main(void)
{
	printf("%d\n", syscall(__NR_perf,15));
	return 0;
}