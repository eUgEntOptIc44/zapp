## Die Videos laufen nicht – was soll ich tun?

Wenn die Video-Streams auf Android nicht abspielbar sind, kann das mehrere Gründe haben:

- Vielleicht benutzt du Zapp außerhalb Deutschlands. Einige Sender blockieren den Zugriff auf ihre Streams oder einzelne Sendungen für Nutzer außerhalb Deutschlands. Wenn du dir nicht sicher bist, rufe die entsprechende Sender-Webseite auf deinem PC auf und schaue, ob der Live-Stream dort läuft. Wenn du dort eine Fehlermeldung über **Geoblocking** bekommst, kann Zapp daran im Moment leider nichts ändern.

- Vielleicht ist deine Internet-Verbindung langsam, unzuverlässig oder wird von einer Firewall blockiert.

- Vielleicht unterstützt dein Gerät den Video-Codec nicht. Du kannst den Stream in einem anderen Videoplayer starten, indem du den Menü-Button drückst, nachdem du einen Sender ausgewählt hast. Klicke auf "Teilen" und öffne den Stream mit Google Video Player. Wenn Google Video Player den Stream auch nicht abspielen kann, wird das Videoformat ziemlich sicher nicht von deinem Gerät unterstützt.


## Warum sehe für einige Sender keine Programminformationen?

Die meisten Sender haben keine öffentliche API, um Sendungsinformationen abfragen zu können. Deswegen versucht Zapp die Webseiten der Sender nach den gerade laufenden Sendungen zu durchsuchen. Dieser Ansatz ist nicht besonders zuverlässig und kann schnell kaputt gehen, wenn eine Webseite geändert oder aktualisiert wird.


## Warum fehlen einige Sender wie RTL oder Pro7?

Zapp streamt nur öffentlich-rechtliche Sender. Sender wie RTL und Pro7 gehören privaten Firmen und dürfen ohne Bezahlung nicht gestreamt werden.


## Warum fehlen Sendungen in der Mediathek?

Zapp ist Teil von [MediathekView](https://mediathekview.de/) und nutzt deshalb die Mediathek-API von [MediathekViewWeb](https://mediathekviewweb.de/). Die meisten Sender haben allerdings keine öffentliche API, um Sendungsinformationen abfragen zu können. Daher kann es passieren, dass Sender oder einzelne Sendungen fehlen oder Sendungsinformationen auch einmal unvollständig sind.


## Warum werden in der Mediathek Sendungen doppelt angezeigt?

Es kommt öfter vor, dass die gleiche Sendung in den Mediatheken verschiedener Sender hochgeladen wird. Da Zapp alle verfügbaren Sendungen anzeigt, sieht es dann manchmal so aus, als würden Sendungen doppelt angezeigt.


## Warum werden keine Untertitel angezeigt, obwohl ich sie aktiviert habe?

Manchmal werden Untertitel von den Mediatheken in einem unerwarteten Format ausgeliefert, sodass Zapp sie nicht darstellen kann. Leider gibt es keinen Weg, diese Fehler vorher zu erkennen. Oft reicht es aber schon aus, ein bisschen zu warten, bis die Untertitel fertig geladen haben.


## Kann Zapp die Untertitel der Live-Streams anzeigen?

Manche Sender wie das ZDF bieten Untertitel in einigen Sendungen der Live-Streams. Zapp zeigt die Untertitel automatisch an, wenn sie Systemweit in den Android-Einstellungen aktiviert wurden. Hier kann auf manchen Systemen auch das Aussehen der Untertitel angepasst werden.


## Warum wird in einem Sender immer der gleiche Videoschnipsel angezeigt?

Der Sender ist nicht mehr unter der Adresse erreichbar, die Zapp erwartet und muss aktualisiert werden. Bitte wende dich an die Entwickler, damit das Problem gelöst werden kann.


## Warum ist das Video-Bild angeschnitten oder hat schwarze Balken links und rechts?

Dein Bildschirm hat ein anderes Seitenverhälnis, als das abgepielte Video. Du kannst das Video mithilfe der Pinch-Geste (zwei Finger zusammen- oder außeinander ziehen) größer oder kleiner ziehen.


## Warum unterstützt Zapp kein Chromecast?

Chromecast kann nur über eine nicht-quelloffene Bibliothek in Android-Apps eingebunden werden. Da diese Bibliotheken nicht über F-Droid verteilt werden dürfen, kann Zapp Chromecast nicht unterstützen.
