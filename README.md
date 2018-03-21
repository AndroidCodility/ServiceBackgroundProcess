# Service Background Process
Android application for a service component that runs in the background to perform long-running operations without needing to interact with the user and it works even if application is destroyed using Kotlin Programming Language.

A [Service](https://developer.android.com/guide/components/services.html) is an application component that can perform long-running operations in the background, and it does not provide a user interface. Another application component can start a service, and it continues to run in the background even if the user switches to another application. Additionally, a component can bind to a service to interact with it and even perform interprocess communication (IPC). For example, a service can handle network transactions, play music, perform file I/O, or interact with a content provider, all from the background.
   
These are the three different types of services:

1.Foreground:
A foreground service performs some operation that is noticeable to the user. For example, an audio app would use a foreground service to play an audio track. Foreground services must display a Notification. Foreground services continue running even when the user is not interacting with the app.

2.Background:
A background service performs an operation that is not directly noticed by the user. For example, if an app used a service to compact its storage, that would usually be a background service.

3.Bound:
A service is bound when an application component binds to it by calling bindService(). A bound service offers a client-server interface that allows components to interact with the service, send requests, receive results, and even do so across processes with interprocess communication (IPC). A bound service runs only as long as another application component is bound to it. Multiple components can bind to the service at once, but when all of them unbind, the service is destroyed.

SERVICE 1     |  SERVICE 2 |  SERVICE 3 |
:---------:|:----------:|:---------:
![](https://github.com/AndroidCodility/ServiceBackgroundProcess/blob/master/design/main.png?raw=true)  |  ![](https://github.com/AndroidCodility/ServiceBackgroundProcess/blob/master/design/start.png?raw=true) |  ![](https://github.com/AndroidCodility/ServiceBackgroundProcess/blob/master/design/stop.png?raw=true) 

# Play Video
[![](https://github.com/AndroidCodility/ServiceBackgroundProcess/blob/master/design/service_video.png?raw=true)](https://youtu.be/iVNsYOyQcx0 "Click here to watch")

# Like Facebook Page
[![](https://github.com/AndroidCodility/Barchart-Graph/blob/master/design/fb.png?raw=true)](https://www.facebook.com/androidcodility/ "Click here")
