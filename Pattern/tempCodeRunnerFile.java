

    static void pattern5(int n){ 
        for (int row = 1; row <= 2*n; row++) {
            int totalColsInRow =  row > n ? 2*n  -row :  row;
             // for every row , run the column
            for( int col = 0; col < totalColsInRow; col++){
                // System.out.print(totalColsInRow);
                // System.out.println(col);
                System.out.print("*");
                 