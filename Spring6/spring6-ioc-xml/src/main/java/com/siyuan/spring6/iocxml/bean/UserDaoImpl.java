package com.siyuan.spring6.iocxml.bean;

/**
 * @author Siyuan
 * @date 2024/10/13/15:42
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void run() {
        System.out.println("run...");
    }
}
