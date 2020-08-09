# mall

<p>
  <a href="#Публика"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E5%85%AC%E4%BC%97%E5%8F%B7-macrozheng-blue.svg" alt="Публика"></a>
  <a href="https://github.com/macrozheng/mall-learning"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E5%AD%A6%E4%B9%A0%E6%95%99%E7%A8%8B-mall--learning-green.svg" alt="Учебное пособие"></a>
  <a href="https://github.com/macrozheng/mall-swarm"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/Cloud%E7%89%88%E6%9C%AC-mall--swarm-brightgreen.svg" alt="SpringCloud версия"></a>
  <a href="https://github.com/macrozheng/mall-admin-web"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E5%89%8D%E7%AB%AF%E9%A1%B9%E7%9B%AE-mall--admin--web-green.svg" alt="Front-end проект"></a>
  <a href="http://qm.qq.com/cgi-bin/qm/qr?k=V6xu5c12j9qhnMUNdDRzakNxRKzOxibQ"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/QQ%E7%BE%A4-959351312-red.svg" alt="QQ группа"></a>
  <a href="#Публика"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E4%BA%A4%E6%B5%81-%E5%BE%AE%E4%BF%A1%E7%BE%A4-2BA245.svg" alt="общаться с"></a>
  <a href="https://gitee.com/macrozheng/mall"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E7%A0%81%E4%BA%91-%E9%A1%B9%E7%9B%AE%E5%9C%B0%E5%9D%80-orange.svg" alt="Code Cloud"></a>
</p>

## Предисловие

`mall` Проект стремится построить полную систему электронной коммерции, используя современные популярные технологии.

## Проектная документация

- Адрес документа：[http://www.macrozheng.com](http://www.macrozheng.com)
- Альтернативный адрес：[https://macrozheng.github.io/mall-learning](https://macrozheng.github.io/mall-learning)

## Введение в проект

`mall` Проект представляет собой систему электронной коммерции, включающую в себя внешнюю торговую сеть и внутреннюю систему управления.，Основано на реализации SpringBoot + MyBatis с использованием Docker в контейнерах. Система внешнего торгового центра включает в себя такие модули, как портал домашней страницы, рекомендации по продукту, поиск продукта, отображение продукта, корзина покупок, процесс заказа, центр участников, служба поддержки клиентов и справочный центр. Внутренняя система управления включает в себя такие модули, как управление товарами, управление заказами, управление членством, управление продвижением, управление операциями, управление контентом, статистические отчеты, управление финансами, управление полномочиями и настройки.

### Демонстрация проекта

#### Система управления за кулисами

Front-end проект`mall-admin-web`адрес：https://github.com/macrozheng/mall-admin-web

Адрес демонстрации проекта： [http://www.macrozheng.com/admin/index.html](http://www.macrozheng.com/admin/index.html)  

![Демонстрация работы системы управления Backstage](http://img.macrozheng.com/mall/project/mall_admin_show.png)

#### Фасадная система торгового центра

Front-end проект`mall-app-web`Адрес: Оставайтесь с нами......

Адрес демонстрации проекта：[http://www.macrozheng.com/app/index.html](http://www.macrozheng.com/app/index.html)

![Демонстрация функций системы переднего торгового центра](http://img.macrozheng.com/mall/project/mall_app_show.png)

### Организационная структура

``` lua
mall
├── mall-common -- Инструменты и общий код
├── mall-mbg -- MyBatisGenerator Сгенерированный код операции базы данных
├── mall-security -- SpringSecurity Пакет общего модуля
├── mall-admin -- Интерфейс системы управления торговым центром Backstage
├── mall-search -- основанный на ElasticsearchСистема поиска товаров
├── mall-portal -- Интерфейс системы торгового центра
└── mall-demo -- Тестовый код при построении фреймворка
```

### Технический отбор

#### Бэкэнд-технологии

| Технология           | Описание                                    | Официальный сайт                                     |
| -------------------- | ------------------------------------------- | -----------------------------------------------------|
| SpringBoot           | Контейнер + MVC рамки                       | https://spring.io/projects/spring-boot               |
| SpringSecurity       | Структура аутентификации и авторизации      | https://spring.io/projects/spring-security           |
| MyBatis              | Рамки ORM                                   | http://www.mybatis.org/mybatis-3/zh/index.html       |
| MyBatisGenerator     | Генерация кода уровня данных                | http://www.mybatis.org/generator/index.html          |
| PageHelper           | MyBatis плагин физического пейджинга        | http://git.oschina.net/free/Mybatis_PageHelper       |
| Swagger-UI           | Инструмент для производства документов      | https://github.com/swagger-api/swagger-ui            |
| Hibernator-Validator | Валидационные рамки                         | http://hibernate.org/validator                       |
| Elasticsearch        | поисковый движок                            | https://github.com/elastic/elasticsearch             |
| RabbitMQ             | очередь сообщений                           | https://www.rabbitmq.com/                            |
| Redis                | Распределенный кеш                          | https://redis.io/                                    |
| MongoDB              | NoSql база данных                           | https://www.mongodb.com                              |
| Docker               | Двигатель контейнера приложений             | https://www.docker.com                               |
| Druid                | Пул соединений с базой данных               | https://github.com/alibaba/druid                     |
| OSS                  | Хранение объектов                           | https://github.com/aliyun/aliyun-oss-java-sdk        |
| MinIO                | Хранение объектов                           | https://github.com/minio/minio                       |
| JWT                  | Поддержка входа в JWT                       | https://github.com/jwtk/jjwt                         |
| LogStash             | Инструмент для сбора журналов               | https://github.com/logstash/logstash-logback-encoder |
| Lombok               | Упрощенный инструмент для упаковки объектов | https://github.com/rzwitserloot/lombok               |
| Jenkins              | Инструменты автоматического развертывания   | https://github.com/jenkinsci/jenkins                 |

#### Front-end технология

| технология | Описание                                     | Официальный сайт                       |
| ---------- | -------------------------------------------- | -------------------------------------- |
| Vue        | Фронтальный каркас                           | https://vuejs.org/                     |
| Vue-router | Маршрутные рамки                             | https://router.vuejs.org/              |
| Vuex       | Глобальная структура управления государством | https://vuex.vuejs.org/                |
| Element    | Интерфейсный интерфейс                       | https://element.eleme.io               |
| Axios      | Front-end HTTP Framework                     | https://github.com/axios/axios         |
| v-charts   | Основы диаграммы на основе Echarts           | https://v-charts.js.org/               |
| Js-cookie  | инструмент управления cookie                 | https://github.com/js-cookie/js-cookie |
| nprogress  | Индикатор хода выполнения                    | https://github.com/rstacruz/nprogress  |

#### Архитектурная схема

##### Схема архитектуры системы

![Схема архитектуры системы](http://img.macrozheng.com/mall/project/mall_micro_service_arch.jpg)

##### Схема бизнес-архитектуры

![Схема архитектуры системы](http://img.macrozheng.com/mall/project/mall_business_arch.png)

#### Введение в модуль

##### Система управления за кулисами `mall-admin`

- Товарный менеджмент：[Функциональная структура чарт-товар.jpg](document/resource/mind_product.jpg)
- Управление заказами：[Структура функции диаграммы-порядок.jpg](document/resource/mind_order.jpg)
- Управление продвижением：[Структура функции чарт-продвижения.jpg](document/resource/mind_sale.jpg)
- Управление содержанием：[Структура функции chart-content.jpg](document/resource/mind_content.jpg)
- Управление пользователями：[Функциональная структура Чарта-пользователя.jpg](document/resource/mind_member.jpg)

##### Фасадная система торгового центра `mall-portal`

[Функциональная структура диаграммы-ресепшн.jpg](document/resource/mind_portal.jpg)

#### Развитие прогресса

![График развития проекта](http://img.macrozheng.com/mall/project/mall_dev_flow.png)

## Настройка среды

### Инструменты разработки

| 工具          | 说明                | 官网                                            |
| ------------- | ------------------- | ----------------------------------------------- |
| IDEA          | 开发IDE             | https://www.jetbrains.com/idea/download         |
| RedisDesktop  | redis客户端连接工具 | https://redisdesktop.com/download               |
| Robomongo     | mongo客户端连接工具 | https://robomongo.org/download                  |
| SwitchHosts   | 本地host管理        | https://oldj.github.io/SwitchHosts/             |
| X-shell       | Linux远程连接工具   | http://www.netsarang.com/download/software.html |
| Navicat       | 数据库连接工具      | http://www.formysql.com/xiazai.html             |
| PowerDesigner | 数据库设计工具      | http://powerdesigner.de/                        |
| Axure         | 原型设计工具        | https://www.axure.com/                          |
| MindMaster    | 思维导图设计工具    | http://www.edrawsoft.cn/mindmaster              |
| ScreenToGif   | gif录制工具         | https://www.screentogif.com/                    |
| ProcessOn     | 流程图绘制工具      | https://www.processon.com/                      |
| PicPick       | 图片处理工具        | https://picpick.app/zh/                         |
| Snipaste      | 屏幕截图工具        | https://www.snipaste.com/                       |
| Postman       | API接口调试工具      | https://www.postman.com/                        |
| Typora        | Markdown编辑器      | https://typora.io/                              |

### 开发环境

| 工具          | 版本号 | 下载                                                         |
| ------------- | ------ | ------------------------------------------------------------ |
| JDK           | 1.8    | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Mysql         | 5.7    | https://www.mysql.com/                                       |
| Redis         | 5.0    | https://redis.io/download                                    |
| Elasticsearch | 6.2.2  | https://www.elastic.co/downloads                             |
| MongoDB       | 4.2.5  | https://www.mongodb.com/download-center                      |
| RabbitMQ      | 3.7.14 | http://www.rabbitmq.com/download.html                        |
| Nginx         | 1.10   | http://nginx.org/en/download.html                            |

### 搭建步骤

> Windows环境部署

- Windows环境搭建请参考：[mall在Windows环境下的部署](http://www.macrozheng.com/#/deploy/mall_deploy_windows);
- 注意：只启动mall-admin,仅需安装Mysql、Redis即可;
- 克隆`mall-admin-web`项目，并导入到IDEA中完成编译：[前端项目地址](https://github.com/macrozheng/mall-admin-web);
- `mall-admin-web`项目的安装及部署请参考：[mall前端项目的安装与部署](http://www.macrozheng.com/#/deploy/mall_deploy_web)。

> Docker环境部署

- 使用虚拟机安装CentOS7.6请参考：[虚拟机安装及使用Linux，看这一篇就够了](http://www.macrozheng.com/#/reference/linux_install);
- Docker环境的安装请参考：[开发者必备Docker命令](http://www.macrozheng.com/#/reference/docker);
- 本项目Docker镜像构建请参考：[使用Maven插件为SpringBoot应用构建Docker镜像](http://www.macrozheng.com/#/reference/docker_maven);
- 本项目在Docker容器下的部署请参考：[mall在Linux环境下的部署（基于Docker容器）](http://www.macrozheng.com/#/deploy/mall_deploy_docker);
- 本项目使用Docker Compose请参考： [mall在Linux环境下的部署（基于Docker Compose）](http://www.macrozheng.com/#/deploy/mall_deploy_docker_compose);
- 本项目在Linux下的自动化部署请参考：[mall在Linux环境下的自动化部署（基于Jenkins）](http://www.macrozheng.com/#/deploy/mall_deploy_jenkins);

> 相关环境部署

- ELK日志收集系统的搭建请参考：[SpringBoot应用整合ELK实现日志收集](http://www.macrozheng.com/#/technology/mall_tiny_elk);
- 使用MinIO存储文件请参考：[前后端分离项目，如何优雅实现文件存储](http://www.macrozheng.com/#/technology/minio_use);
- 读写分离解决方案请参考：[你还在代码里做读写分离么，试试这个中间件吧](http://www.macrozheng.com/#/reference/gaea);
- Redis集群解决方案请参考：[Docker环境下秒建Redis集群，连SpringBoot也整上了！](http://www.macrozheng.com/#/reference/redis_cluster)。

## 公众号

mall项目全套学习教程连载中，关注公众号「**macrozheng**」第一时间获取。

加微信群交流，公众号后台回复「**加群**」即可。

![公众号图片](http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/banner/qrcode_for_macrozheng_258.jpg)

## 许可证

[Apache License 2.0](https://github.com/macrozheng/mall/blob/master/LICENSE)

Copyright (c) 2018-2020 macrozheng
