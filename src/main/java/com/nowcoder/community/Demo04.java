package com.nowcoder.community;

import ch.qos.logback.core.db.dialect.DBUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo04 {
    public static void main(String[] args) throws IOException {
//        Connection conn=DBUtils.getConnection();
//        String sql="insert into tb_user values(?,?,?)";
//        PreparedStatement pstmt=conn.prepareStatement(sql);
//
//
//        BufferedReader br=new BufferedReader(new FileReader("test.txt"));
//        String line=br.readLine();
//        while(line!=null){
//            String [] arr=line.split("\\t ");
//            pstmt.setInt(1,Integer.parseInt(arr[0]));
//            pstmt.setString(2,arr[1]);
//            pstmt.setString(3,arr[2]);
//            pstmt.executeUpdate();
//
//            line=br.readLine();
//        }
//        br.close();
    }
}
