class Practice{
public static void main(String[] args) {
    // filled rectangle
   for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
System.out.print("*");}
System.out.println();}

// hollow rectangle
for(int i=0;i<=4;i++){
    for(int j=0;j<=5;j++){
        if(i==0 ||i==4 ||j==0|| j==5){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}

// half piramid
for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
System.out.print("*");

    }
    System.out.println();
}

// inverted half pyramid
for(int i=5;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

// inverted halp pyramid rotate by 180 degree
for(int i=1;i<=5;i++){
    for(int j=1;j<=5-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }
    System.out.println();
}

//half pyramid numbers
for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}

// inverted half pyramid numbers
for(int i=0;i<=4;i++){
    for(int j=1;j<=5-i;j++){
        System.out.print(j);
    }
    System.out.println();
}

// // numbers 1
// 23
// 456
int numbers=1;
for(int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
    System.out.print(numbers+" ");
    numbers++;
}
System.out.println();
}

// 01 triangle
for(int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
    if((i+j)%2==0){
        System.out.print("1");
    }
    else{
        System.out.print("0");
    }
}
System.out.println();
}

// solid rhombus
for(int i=1;i<=5;i++){
    for(int j=1;j<=5-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=5;k++){
        System.out.print("*");
    }
    System.out.println();
}

// numberpyramid
for(int i=1;i<=5;i++){
    for(int j=1;j<=5-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
System.out.print(i+" ");
    }
    System.out.println();
}

//palindromic
for(int i=1;i<=5;i++){
    for(int j=1;j<=5-i;j++){
        System.out.print(" ");
    }
    for(int k=i;k>=1;k--){
System.out.print(k+" ");
    }
    for(int l=2;l<=i;l++){
        System.out.print(l+" ");
    }
    System.out.println();
}

// butterfly
for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    for(int j=1;j<=2*(4-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=4;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    for(int j=1;j<=2*(4-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

// diamond
for(int i=1;i<=5;i++){
    for(int j=0;j<5-i;j++){
        System.out.print(" ");
    }
    
    for(int j=1;j<=2*i-1;j++){
 System.out.print("*");
    }
    System.out.println();
    
}
for(int i=5;i>=1;i--){
    for(int j=0;j<5-i;j++){
        System.out.print(" ");
    }
    
    for(int j=1;j<=2*i-1;j++){
 System.out.print("*");
    }
    System.out.println();
    
}



}

}