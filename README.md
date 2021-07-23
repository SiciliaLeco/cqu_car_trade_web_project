# comprehensive_design - 新版项目架构

maven可以相互依赖,环境整理完毕,务必看完本文档

## 运行方式
- 对每个module,在idea中使用springboot运行  
- ui是前端后端module,这个module是服务的消费者, 一般在启动了别的服务后最后启动, 如果别的服务还没启动, 但是又需要测试, 可以在本地注释掉某些服务的controller.java
- 添加新module时使用 idea->File->new->Module, 直接建立空maven项目, 注意在idea中选择正确的parent(一般选car_trade_project)

## 本地zookeeper搭建方式
- 需要用到 8887 8080 8081 8082端口, 注意其它应用不能占用这几个端口
- 首先解压zookeeper文件夹, 将conf中的zoo_sample.cfg复制为zoo.cfg
- 修改zoo.cfg中的dataDir为你想要的文件夹, 并在zoo.cfg中添加一行admin.serverPort=8887
- 启动系统的命令行, 在bin目录下运行 `zkServer.cmd` , 如果是Linux或Mac, 运行 `bash zkServer.sh start`
- 编译并运行dubbo-admin, 不运行这个也可以, 这个主要用来查看服务和测试服务
- 解压dubbo-admin-develop, 在根目录下运行`mvn clean package -Dmaven.test.skip=true`进行编译
- 运行`mvn --projects dubbo-admin-server spring-boot:run`启动dubbo-admin

## 关于dubbo配置
- 配置文件在resources/application.yml
- 直接参照buyer_service的pom就可以自行配置
- 如果本地没有zookeeper, 将这里的address: zookeeper://127.0.0.1:2181 修改成zookeeper://192.168.2.31:2181?backup=192.168.2.32:2181,192.168.2.33:2181,然后在云端运行
- 不同应用的dubbo端口不同

## 项目结构
- car_trade_project: 父目录, 请在父pom中配置共有依赖
- pojo: java对象, 包含数据库对象, 后端返回对象等
- ui: 前端与后端, controller中调用别的服务
- mappers: 数据库服务
- car_service: 样例展示服务, 将service-api-mybatis写在了一起的项目, 可以正常运行, 可以被调用

## 一些坑点
- 务必使用application.yml文件管理环境
- 务必使用idea打开car_trade_project这个父目录
- 用到什么服务或组件, 需要在pom.xml dependency中加依赖
- 如果本地装了zookeeper, 可以将dubbo的注册点改成本地127.0.0.1,这样可以在本地运行项目
- 不同服务的dubbo端口不同
- 不同项目中端口尽量不要相同
- 在application.yml中, 映射文件应该这样写, mapper-locations: classpath:org/cqu/mapper/*.xml 后面的路径代表你在resources中mapper.xml的相对路径, 
- 由于mapper层独立成module, 因此需要在你运行的application.java上面加上@MapperScan("org.cqu.mapper") 解决无法调用mapper问题
- 建议前后端直接交互使用org.cqu.backend_result.ResultBean类来交互, 这个类会自动返回一个json{'msg','success','data'}
- 搭建vpn, 将远程服务映射到本地, 加快开发进度

## dubbo端口
- buyer_service 9094 -- 20884
- cache_service 9097 -- 20887
- car_include_service 9098 -- 20888
- car_service 9093 -- 20883
- cart_service 9099 -- 20889
- include_service 9096 -- 20886
- picture_service 9091 -- 20881
- seller_service 9092 -- 20882
- ui 8000
