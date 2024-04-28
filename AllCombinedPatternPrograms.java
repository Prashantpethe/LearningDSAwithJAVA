public class AllCombinedPatternPrograms {

        static void print1(int n){
//output
//* * * * *
//* * * * *
//* * * * *
// * * * * *
// * * * * *
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
        static void Nby2Forest(int n)
        {
//Output
//*
//* *
//* * *
//* * * *
//* * * * *
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        static void nTriangles(int n){
//output
//        1
//        12
//        123
//        1234
//        12345
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        static void rightAngledNumberPyramid(int n){
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++){
                    System.out.print(i+"");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            int n=5;
            print1(n);
            System.out.println();
            Nby2Forest(n);
            System.out.println();
            nTriangles(n);
            System.out.println();
            rightAngledNumberPyramid(n);

        }
    }
