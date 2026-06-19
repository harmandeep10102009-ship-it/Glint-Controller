# Glint Customizer

A Minecraft 1.16.5 Fabric mod that allows you to customize the enchanted glint strength and animation speed.

## Features

- **Adjust Glint Strength**: Control how bright/visible the enchantment glint is (0.0 - 2.0+)
- **Control Glint Speed**: Modify the animation speed of the glint effect (0.0 - 2.0+)
- **Enable/Disable Glints**: Toggle glint effects on/off entirely
- **Live Configuration**: JSON-based config file for easy adjustment

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) for Minecraft 1.16.5
2. Download the mod JAR from [Releases](https://github.com/harman2009/glint-controller/releases)
3. Place it in your `mods/` folder
4. Launch Minecraft with the Fabric profile

## Configuration

The mod creates a configuration file at `config/glint-controller.json`:

```json
{
  "glintStrength": 1.0,
  "glintSpeed": 1.0,
  "enableGlint": true
}
```

### Config Options

- **glintStrength** (float): How bright the glint is
  - `1.0` = vanilla strength
  - `0.5` = half brightness
  - `2.0` = double brightness
  - `0.0` = invisible (but still enabled)

- **glintSpeed** (float): Animation speed multiplier
  - `1.0` = vanilla speed
  - `0.5` = half speed (slower animation)
  - `2.0` = double speed (faster animation)

- **enableGlint** (boolean): Master enable/disable
  - `true` = glints visible
  - `false` = no glints render

Changes to the config file take effect on game restart.

## Building from Source

```bash
./gradlew build
```

The compiled JAR will be in `build/libs/`.

## Compatibility

- **Minecraft Version**: 1.16.5
- **Loader**: Fabric Loader 0.12.12+
- **Java**: Java 8+
- **Environment**: Client & Server (client-side only effects)

## License

MIT License - See LICENSE file for details

## Author

harman2009
