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

//
//            1
//            22
//            333
//            4444
//            55555

            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }

        static void invertedRightPyramid(int n){
            for(int i=1;i<=n;i++)
            {
                for(int j=0;j<n-i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void invertedNumberedRightPyramid(int n){
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i+1;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        static void starPyramid(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    System.out.print(" ");
                }

                for(int j=0;j<2*i+1;j++)
                {
                        System.out.print("*");
                }
                for(int j=0;j<n-i-1;j++)
            {
                    System.out.print(" ");
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
            System.out.println();
            invertedRightPyramid(n);
            System.out.println();
            invertedNumberedRightPyramid(n);
            System.out.println();
            starPyramid(n);
        }
    }
