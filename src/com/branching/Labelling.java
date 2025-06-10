package com.branching;

public class Labelling {
    public static void main(String[] args){
       outerloop: for(int j = 1; j<4 ; j++){
        innerloop : for(int i = 1; i<=3 ; i++){
            if(i == 2) {
                break innerloop;
            }System.out.println("the value of i (Col ) : " + i + " " + "value of j (row) : " + j);
        }

        //    System.out.println("value of j (row) : " + j +  " ");
        }

//        outerloop: for(int j = 1; j<4 ; j++){
//            innerloop : for(int i = 1; i<=3 ; i++){
//                if(i == 2) {
//                    break outerloop;
//                }System.out.print("the value of i (Col ) : " + i + " " + " value of j (row) : " + j );
//            }
//
//         //   System.out.println("value of j (row) : " + j +  " ");
//        }

//        outerloop: for(int j = 1; j<4 ; j++){
//            innerloop : for(int i = 1; i<=3 ; i++){
//                if(i == 2) {
//                    continue innerloop;
//                }System.out.println("the value of i (Col ) : " + i + " " + " value of j (row) : " + j );
//            }
//
//            //   System.out.println("value of j (row) : " + j +  " ");
//        }

//        outerloop: for(int j = 1; j<4 ; j++){
//            innerloop : for(int i = 1; i<=3 ; i++){
//                if(i == 2) {
//                    continue outerloop;
//                }System.out.println("the value of i (Col ) : " + i + " " + " value of j (row) : " + j );
//            }
//
//            //   System.out.println("value of j (row) : " + j +  " ");
//        }
    }
}
