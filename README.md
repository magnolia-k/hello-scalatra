# Hello Scalatra

Scalatraで書かれたHello Worldサンプルアプケーションです。

# 使い方

```bash
$ git clone https://github.com/magnolia-k/hello-scalatra
$ cd hello-scalatra
$ sbt
sbt:Hello Scalatra > jetty:start
```

ブラウザから`http://localhost:8080`へアクセスすると「Hello, World」と表示されます。`http://localhost:8080?name=Scala`というように、`name`パラメータを付けると`name`で指定したパラメータの内容が`Hello`に続いて表示されます。この場合の表示は、`Hello, Scala`となります。

終わったら、アプリケーションを停止します。

```bash
sbt:Hello Scalatra > jetty:stop
```
