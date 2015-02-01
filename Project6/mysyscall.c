#include<linux/linkage.h>
asmlinkage long sys_perf(int i)
{
	printk("My system Call!!!");
	return i + 10;
}