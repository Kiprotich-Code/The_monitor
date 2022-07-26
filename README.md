# The_monitor

It's not too bad to use technology to monitor the little processes, it's not good either.

!Important Note

1. Everyone / Anyone can contribute.
2. Every directory must have a detailed README.md file at it's root.
3. Every contribution MUST be accompanied by a clear and concise commit message.
4. Every code MUST be well documented and formatted.


What about the monitor ?

- The android application tracks attendance and keeps records in real time. The implentation with it's scope 'a university's class' is based on a reasearch question ('Did the class happen ?') and time schedule provided by the institution's administration.

How it works 

The mobile-based application pops-up a message on the phone of class representative (class rep) when the class of a given course unit begins and when it ends. The pop-up should only be during the time schedule as provided in the timetable. The first pop-up message finds out whether the class will be there, by the lecturer. If answered yes, the next pop-up should come exactly after five minutes to find out whether the teaching has started. If answered not, then it should pop-up again exactly after every double minute of the previous pop-up time. If answered yes, then it should request for the starting time (system time – maximum of elapsed minutes of the last alert). The last pop-up message occurs 20 minutes before the official ending of the session as per the timetable to find out whether teaching has ended if the class was there anyway. If answered no, the next pop-up should come exactly after five minutes to find out whether the teaching has ended. If answered no, then it should pop-up again exactly after every double minute of the previous pop-up time. If answered yes, then it should request for the end time (system time – maximum of elapsed minutes of the last alert).


Languages
Java is the default programming language.
It will be great to have other implementations too, like; Python(Kivy), Kotlin, Springboot or Flutter framework e.t.c
However, every implementation should have it's own directory.


With Sincere Gratitude,

Lawi Kiprotich & Herbert Kipkemoi
Leave a star, share, follow
Further advise: fleeklawi@gmail.com 
