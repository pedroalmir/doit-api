doit-api
========


Este projeto descreve a interface para a criação de plugin para
a aplicação doit. Basta implementar a interface e enviar para
http://pedroalmir.com/doit/newPlugin.

Se seu plugin for considerado relevante ele será incorporado ao
sistema e irá ficar disponível para os demais usuários.

HowTo:

1. Download doit-api.jar e adicione ele ao classpath do seu projeto.
2. Implemente a interface ApplicationPlugin.java
3. Crie o descritor para o serviço dentro da pasta META-INF.
4. Exporte o projeto como JAR.
5. Enviar seu JAR para nossa aplicação.
