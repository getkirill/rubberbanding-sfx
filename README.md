# Rubberbanding SFX
[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/L3L1MCIUH)

Plays a sound every time server forcibly changes your location (due to teleports, lag, or rubberbanding). Entirely clientside.  
Requires Architectury API (and Fabric API on Fabric).  
Currently only 1.21.4 is supported (Fabric & NeoForge). If you want a port to older or newer version please open an issue in the mod's GitHub repository.
## Changing the sound
### Replacing mod files
Easiest way to change out the sound is by replacing it in the .jar file.  
1. Open mod.jar with your favourite archiving tool (7-Zip, Win-Rar).
2. Go to `assets/rubberbanding_sfx/sounds`
3. Replace respawn.ogg with your .ogg (Vorbis) sound
### Resource packs
The "rubberbanding" sound is a separate sound event that can be modified with resource pack. Put following into your resource pack's `assets/rubberbanding_sfx/sounds.json`:
```json
{
  "entity.player.rubberband": {
    "replace": true,
    "subtitle": "subtitles.entity.player.teleport",
    "sounds": [
      "rubberbanding_sfx:your_sound_here"
    ]
  }
}
```

Then, put your .ogg (Vorbis) sound into `assets/rubberbanding_sfx/sounds/your_sound_here.ogg`