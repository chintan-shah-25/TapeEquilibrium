import java.math.*;
class TapeEq{

public int solution(int[] A) {

int sum=0;
int leftsum=0;
int min=Integer.MAX_VALUE;

for(int i=0;i<A.length;i++)
{
sum=sum+A[i];
}

int diff;
for(int j=1;j<A.length;j++)
{
leftsum=leftsum+A[j-1];
diff=Math.abs(sum-2*leftsum);
if(diff<min)
min=diff;
}

return min;
}

}
