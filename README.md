# Typora-ImagePlugin-Mac

由于使用typora的时候图片都是保存在本地，如果需要用到接口服务器的存储该怎么办呢？

修改代码段 

![image](https://user-images.githubusercontent.com/42985524/198181728-ca88d4fe-208a-4d43-8721-70236202b2bf.png)

这里代表使用本地curl的命令把文件上传到服务器的命令,服务器接口尽可能简单。

例如，美团某处可以直接通过以下命令上传图片到服务器：

![image](https://user-images.githubusercontent.com/42985524/198181990-e2697b56-31a0-4ff3-934e-2cbf0bf80981.png)

具体命令根据自己服务器的接口实现自己改，需要注意的是返回的json数据格式需要提取其中的图片地址 打印出来，所以这边使用gson解析json获取url

![image](https://user-images.githubusercontent.com/42985524/198182148-08dba18f-0fc2-46df-bf86-2687d37c1990.png)

后续,通过设置artifacts打包即可

![image](https://user-images.githubusercontent.com/42985524/198182346-416d2850-9072-4272-a78c-c7a122a49c42.png)

打包后会得到一个jar包文件 放到一个目录 在typora偏好设置

![image](https://user-images.githubusercontent.com/42985524/198182531-337f4c42-7cc5-4458-8098-5e92e2105d75.png)

后面通过验证图片上传来验证一下

![image](https://user-images.githubusercontent.com/42985524/198182606-27618c24-fd17-4fd0-a955-3870ca25815e.png)

效果如下

![image](https://user-images.githubusercontent.com/42985524/198182475-909ab57a-e9bb-4acc-be1e-9cbe96a9451e.png)

这样 后续只要能在某些大厂存在未验证授权的文件上传功能 可以持续打包各位插件白嫖图床


