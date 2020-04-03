package word21;

import java.util.ArrayList;
import java.util.List;

public class YangHuiSanJiao {
    public List<List<Integer>>generate(int numRows){
        //杨辉三角的特点
        //1.第一行固定，就是1
        //2.第二行也固定就是1，1
        //3.第三行，首尾元素都固定是1
        //4.第i行有i个元素
        //5.对于第i行来说，第j列的值就是i-1行j-1列值加上i-1行j列值
        if(numRows<=0){
            return new ArrayList<>();
        }
        List<List<Integer>>result=new ArrayList<>();
        //1.先准备第一行就是1
        List<Integer>firstLine=new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if(numRows==1){
            return result;
        }
        //2.在插入第二行
        List<Integer>secondLine=new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if(numRows==2){
            return result;
        }
        //3.就要处理第i行
        //第i行有i列（i，j）=（i-1，j）+（i-1，j-1）；第一个和最后一个固定是1
        //arr[row][col];
        //result.get(row).get(col);
        //List<Integer>line=result.get(row);
       //line.get(col);
        for(int row=3;row<=numRows;row++){
            //如果要知道第row行就要知道第row-1行的内容
            List<Integer>prevLine=result.get(row-1-1);//难点1
            List<Integer>curLine=new ArrayList<>();
            curLine.add(1);
            //第row行应该有row列，下面这个循环相当于循环row-2次
            //因为第一列和最后一列都固定是1；
            //针对这种“差一”问题，最好的办法就是带入具体数字来验证是否合理
            for(int col=2;col<row;col++){
                int curNum=prevLine.get(col-1-1)+prevLine.get(col-1);//难点（col-1-1）
            }
        //    最后处理改行最后一个
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}
