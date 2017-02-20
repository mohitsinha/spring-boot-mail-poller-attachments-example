E-mail poller gmail using Spring boot mail support 
=======



```
Spring Boot + Spring Mail Integration
```

###Description
This project demonstrates how to periodically read emails from gmail and process them. This project can be used with any other email provider also.

###How to Open
```
./gradlew idea
IntelliJ -> Open -> .ipr
```

###Configuration
```
- file.download.location=change to location where attachments will be downloaded
- mail.folder.name= mail folder
- In resources/hello/integration.xml correctly configure store-uri="imaps://username:password@imap.gmail.com/INBOX"
- Give write access to current user for /var/log/email-poller for creating logs
```

###How to Run
```
- ./gradlew bootRun
- Run main() on Application Class
```



