# 5 Objektorientierte Programmierung IAS
# 5.1 Programmierprinzip
Grundlage: THI RobCon mit Saphira-Architektur<br>
Proaktive Ebene: Endlicher Automat<br>
Reaktive Ebene: Verhaltensmuster mit Resolvierung<br>

## Basisklassen:<br>
![Basisklassen](Images/Basisklassen.png) 

## Ausgewählte Methoden Basisklassen
### Saphira Robot
| Methode | Beschreibung |
| --- | --- |
` Pose getPose() ` | Positionskoordinaten Fahrzeug (x,y,th) <br>
` double getTransVel() `<br>`double getRotVel()`| aktuelle Geschwindigkeiten Fahrzeug
`int getSonarRange(int n)`| Entfernungsmessung Sonar n in mm bezogen auf Fahrzeugmittelpunkt, maximal 3 m
`int getRadius()`| Abfrage Roboterradius

### Behaviour
Virtuelle Oberklasse Verhaltensmuster mit abstrakter Methode fire(), wird vom Resolver zykklisch alle 100ms aufgerufen <br>
Erzeugen Instanzen von Unterklassen der Oberklasse Desire für den Priority Resolver als Aktionsvorschläge <br>

### Unterklassen von Desire
`DesTransVel, DesRotVel` Wünsche für Geschwindigkeiten <br>
`DesCamPan, DesCamTilt ` -=- Kamerabewegungen <br>
`DesGrip, DesLift` -=- Manipulatorpositionen <br>

