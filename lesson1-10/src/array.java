import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        String nameS []={"语","数","外"};

       double score[] []=new double [10] [nameS.length];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<nameS.length;j++)
            {
                score [i] [j]=Math.random()*10+80;
            }
        }
        System.out.println("请输入要查最好成绩的年份");
        Scanner in=new Scanner(System.in);
        int year=in.nextInt()-1;
        int nameIndex=0;
        double MAXscore=score [0] [0];
        for(int j=0;j<nameS.length;j++)
            {


                if(MAXscore<score [year] [j])
                {
                    MAXscore=score [year] [j];
                    nameIndex=j;
                }

            }
            System.out.println("最好成绩是"+nameS[nameIndex]+":"+MAXscore);


    }
}
