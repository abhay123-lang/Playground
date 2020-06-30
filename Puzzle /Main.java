#include<iostream>
int main()
{
  int r,c;
  std::cin>>r>>c;
  int mat1[r][c], mat2[c][r];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      std::cin>>mat1[i][j];
      mat2[j][i]=mat1[i][j];
    }
  }
  for(int i=0;i<c;i++){
    for(int j=0; j<r;j++){
      std::cout<<mat2[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}