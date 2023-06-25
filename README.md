# Semblance
[![build](https://img.shields.io/github/actions/workflow/status/EcoBuilder13/semblance/build.yml?branch=1.20.x&logo=github&style=for-the-badge)](https://github.com/EcoBuilder13/Semblance/actions) [![modrinth](https://img.shields.io/modrinth/dt/semblance?logo=modrinth&style=for-the-badge)](https://modrinth.com/mod/semblance)

Semblance is a server side Minecraft mod for the Fabric and Quilt mod loaders. It allows you to configure the server brand so you can hide what type of server you are running from the debug screen.
![example](https://user-images.githubusercontent.com/68478692/144131742-8b9300a4-98c8-4b6e-ab7e-64ef05154a34.png)




## Configuration
By default the server will be rebranded to `TaterMC`. To change this go to the config folder of your server and edit `semblance.properties`. You can change the value of `brand` to any valid string which is not a valid server brand. (vanilla,forge,etc) The only exception to this is the valid name for the mod loader you are using.

## FAQ

- Can you port to Forge?

    - No, there are no plans to port to Forge at this time.
- Can you port to another version?

    - I will only port to newer versions of the game. All releases have their version limited to all minor releases of the current major version when released.
- Why can't I rename my server to a valid name?

    - This is to prevent people from hiding the fact the server is modified as well as prevents people from being able to use this mod to create proof that a fake program can bridge mods across mod loaders. A specific example would be a "mod" that allows fabric mods to run on forge servers with it being a malicious mod that used Semblance to rebrand a fabric server to create fake proof that it works.
