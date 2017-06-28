# ftp服务器架设 in Ubuntu Server
# ftp链接 可上传可删除
## 1. 安装ftp服务
    sudo apt-get install vsftpd
__测试vsftpd服务(非root用户)__

    service vsftpd restart
## 2.配置vsftpd
### (1)vim进入 需要vim命令操作
    sudo vim /etc/vsftpd.conf
    //允许上传
    local_enable = YES