public class Interview {
    public static void main(String[] args) {
        String str[][]={{"giri","12"},{"praveen","22"},{"developer","16"}};
        for(int i=0;i<3;i++){
             
                System.out.print(str[i][0]+" ");
             
        }
        System.out.println(Integer.parseInt(str[1][1])+Integer.parseInt(str[0][1]));
    }
}
