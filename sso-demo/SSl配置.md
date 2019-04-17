## SSL Configuration

# 密钥生成

```shell
keytool -genkeypair -keyalg RSA -keysize 2048 -sigalg SHA1withRSA -validity 36500 -alias jdev01 -keystore d:/cas-ssl/tomcat.keystore -dname "CN=jdev01.fxtcn.com,OU=jdev,O=carl,L=GuangZhou,ST=GuangDong,C=CN"
```

# 证书生成
```shell
keytool -exportcert -alias jdev01 -keystore d:/cas-ssl/tomcat.keystore  -file d:/cas-ssl/tomcat.cer -rfc
```



# 导入cacerts证书库

```shell
keytool -import -alias jdev01 -keystore %JAVA_HOME%\jre\lib\security\cacerts -file d:/cas-ssl/tomcat.cer -trustcacerts
```

# 检查是否导入成功

```bash
keytool -list -keystore "%JAVA_HOME%\jre\lib\security\cacerts" | findstr/i server
```





# 修改hosts

```bash
127.0.0.1 jdev01.fxtcn.com
```

