public class K_Mean{
public static void main(String[] args){
double[][]data = {
{1,1},{1,2},{2,1},{8,8},{9,8}
};
double[][]center = {
{1,1},{8,8}
};
for(int i =0;i < data.length;i++)
{
double minDistance = Double.MAX_VALUE;
int []clusters = new int[data.length];
for(int j = 0;j < center.length;j++)
{
double distance = Math.sqrt(
Math.pow(data[i][0]-center[j][0],2)
-
Math.pow(data[i][1]-center[j][1],2)
);
if(distance < minDistance)
{
minDistance = distance;
clusters[i] = j;
}
}
double[][]newcenter = new double[2][2];
int []count = new int [2];
for(i = 0;i<data.length;i++)
{
int c = clusters[i];
newcenter[c][0] += data[i][0];
newcenter[c][1] += data[i][0];
count[c]++;
}
for(int j = 0;j<2;j++)
{
newcenter[j][0] /= count[j];
newcenter[j][1] /= count[j];
}
for(i =0;i < data.length;i++)
{
System.out.println("("+data[i][0]+","+data[i][1]+")"+"属于第"+clusters[i]+"类");
}
System.out.println("新的中心：");
for(int j = 0;j<2;j++)
{
System.out.println("("+newcenter[j][0]
+","+newcenter[j][1]+")");
}
}
}
};
