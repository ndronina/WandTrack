# WandTrack

Clear mind, focus and presize incantation pronounce are always nessessary for casting a good spell, but wand motion is not less important. Sometimes wand motions can be a bit tricky to remember and even the smallest wrong swish or flick can ruin the whole spell. 

This app will help you master the most famous spells with their canonical wand motions. You'll get to explore some simple spells for everyday use together with advanced DADA practice spells. Also you can find a short description and history of every spell you'll study. Now, wands at the ready!

## Demo
![wandtrackdemo](https://user-images.githubusercontent.com/20670475/142772709-35c0427c-41f1-4c72-937e-cb42a395b87b.gif)


## Requirements
We need a screen with a list of all available spells and a detail screen for the chosen spell with its description. We want any wand motion to be drawn progressively on the screen, so the user can see its direction. Also the spell has to be described with some group of numerical parameters, so we don't create a new view every time we want to implement a new spell. 

## Implementation
For drawing the wand motion we will use Path and for animating it we will progressively change the DashPathEffect parameters. 

Lets describe the spell as a list of primitives (WandTracks). WandTrack is a part of the wand motion and it can be linear (Line) or circular (Arc).

#### WandTrack.Line
![line](https://user-images.githubusercontent.com/20670475/142771431-3c5c46a5-0ee5-4ff4-9623-ebb705472cf1.png)

To draw line on the Path we will need it's start position (x, y) and end position. *The start position will be used for the first line in the wand motion. 

#### WandTrack.Arc
![arc](https://user-images.githubusercontent.com/20670475/142771464-7eeb152e-c7d6-4cf4-9f56-3bc454382680.png)

To draw arc we will to specify the parameters for the oval (left, top, right and bottom positions), start angle (the point where drawing starts) and sweep angle (start angle + degrees we need to draw). 
