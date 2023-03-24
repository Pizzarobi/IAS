# 2. Hardwareaufbau
## 2.1 Basiskomponenten

### <u>Fahrzeuge</u>

<ol type="a">
  <li>Ebener Untergrund -> Räder</li>
  <li>Geländer -> Laufmaschinen</li>
  <li>Rohre -> Kettenantriebe</li>
  <li>Fassaden -> Saugnäpfe</li>
  <li>Katastrophenroboter ->  alle</li>
</ol>

a wird in der Vorlesung besprochen <br>
b - e Literatur

### <u>Flugzeuge</u>
- Klassischer Triebwerskantrieb mit Flügeln
- Multicopter
- Computer gesteuerte unbemannte Luftfahrzeuge (C-UAV)

-> wir konzentrieren uns auf Multicopter
<br><br><br>
## 2.2 Multisensorik
Erfassung der Umwelt

### <u>Odometrie</u>
Radposition, Geschwindigkeit und Weg

### <u>Inertialgeber</u>
Beschleunigung, Verbesserung der Odometriedaten

### <u>Taktile Sensoren</u>
Bumper, Anwesenheitserfassung, Notabschaltung

### <u>Sonar</u>
Entfernung mit Ultraschall, kegelförmige Signalausbreitung, Öffnungswinkel 5° - 30°, Ringabdeckung

### <u>Laserscanner</u>
Entfernung Laserlicht , Öffnungswinkel vernachlässsigbar, Reflektorerkennung

### <u>Radar</u>
Entfernung, elektromagnetische Wellen, 2,5 GHz, Variation Frequenzen (Short/Long Range), Relativgeschwindigkeiten

### <u>Distanzkamera</u>
3D-Abstandsprofil, Time-of-Flight-Messung oder Mustererkennung

### <u>Farbkamera</u>
Farbbilder, Pan-Tilt-Zoom, Erkennung Farbbereiche und Kanten, Entfernung Stereokamera

### <u>GNSS</u>
Satellitennavigation, Genauigkeit 2m / 2cm
<br>
<br>
<br>
## 2.3 Aktoren

Veränderunge der Umwelt<br>
Manipulatioren mit Freiheitsgraden<br>
-> 2 DOF Gruppen im Labor (Greifer + Lift)<br>
Antriebskonzepte Räder -> Handout (Moodle)<br>

- Differentialantrieb
  - 2 DOF - x, yaw
  - Angetrieben durch Gleichstrommotoren
<br>
- Fahr-/Drehmodul
  - 2 DOF Rad -> 3 DOF Plattform
<br>
- Mecanum-Rad
  - Kräfte in 2 Richtungen durch Walzen an den Rädern
  - Nur auf Ebenem Grund nutzbar, sehr anfällig für Schmutz, starke Vibrationen, starker bodenverschleiß
  - Störanfällig