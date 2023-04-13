# 4. Direktsteuerung
Skriptsprache in THI RobCon basierend auf Java
<br><br>
## Lokomotionsbefehle:
| | Translation | Rotation |
| --- | --- | --- |
| Geschwindigkeit <br> (nicht blockierend)| void speed(int v) <br> v in mm/s | void rotate (int av) <br> av in deg/s |
| Position (Odometrie <br> blockierend)| void move(int d) <br> d in mm | void turn(int a) <br> a in deg |

## Manipulatorbefehle (2 DOF):
- void gripOpen()
- void gripClose()
- void liftUp()
- void liftDown()

nicht blockierend

## Sensorbefehle:
### Distanz: int getSonarRange(int n)
- Minimale Hindernisdistanz gemessen mir Sonar n in mm, Default 3000
- Bezug Robotermittelpunkt
- Pioneer Robot hat 0 - 15 Sonarsensoren

### Bilder: int getBlobX(int ch)
- Kamerabild mit 0-319 -> x und 0-239 -> y
- 0,0 ist der linke obere Punkt
- ch ist Kanalnummer
  - z.b. gelb = 1, orange = 2
  - offline Konfiguriert
- Blobberechnung über Region Growing mit zugehörigem Schwerpunkt
- Rückgabe: x-Koordinate Blobschwerpunkt
- void panTilt(int pan, int tilt)
  - in degrees
  - Drehen auf pan
  - Neigen auf tilt

## Kontrollstrukturen:

### void wait(int w)
- warten von n Echtzeitzyklen zu je 100ms
### void setPose(int x, int y, int th)
- Setzen der aktuellen Position des Roboters

## Beispiel:
```java
package thi.robcon.app.script; // <- Unterverzeichnis im Projekt
                       // Java-Konvention: alles klein schreiben
                       // Eclipse: Veschriebungen mit Refactor -> Rename
                       // Eclipse: Strg+Leer generiert
import thi.robcon.ecar.IRobScript; // package - "IRobScript"=Klasse
// import ...

public class ServiceRoboticsScripts extends IRobConScript { // Oberklasse nur eine Möglich
  public ServiceRoboticsScripts() { } // Konstruktor

  protected void script() { patrol(); } // Implementierung einer Virtuellen Methode
  protected void patrol() {
    use Robot(ECarDefines.JSIM_DX1); // einfacher Emulator
  }
}
// ... Weitere erklärung in Eclipse
```
