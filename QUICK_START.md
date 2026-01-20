# Quick Start Guide - Viewing the UML Diagram

## Option 1: View Online (Recommended - Easiest)

1. Open the online PlantUML editor: http://www.plantuml.com/plantuml/uml/
2. Copy the entire contents of `SmartHomePro.puml` 
3. Paste into the editor
4. The diagram will render automatically!

## Option 2: VS Code (For Development)

1. Install VS Code extension: "PlantUML" by jebbs
2. Open `SmartHomePro.puml` in VS Code
3. Press `Alt+D` or use Command Palette > "PlantUML: Preview Current Diagram"
4. The diagram appears in a side panel

## Option 3: Generate PNG/SVG File

### Prerequisites
- Java Runtime Environment (JRE)
- PlantUML JAR file

### Steps
```bash
# Download PlantUML
wget https://sourceforge.net/projects/plantuml/files/plantuml.jar/download -O plantuml.jar

# Generate PNG
java -jar plantuml.jar SmartHomePro.puml

# Generate SVG (vector format, scales better)
java -jar plantuml.jar -tsvg SmartHomePro.puml

# Output files: SmartHomePro.png or SmartHomePro.svg
```

## Option 4: VS Code Extension with Docker (No Java Install)

1. Install Docker Desktop
2. Install VS Code extension: "PlantUML"
3. In VS Code settings, set PlantUML render to use PlantUML Server (Docker)
4. Open and preview the diagram

## What You'll See

The rendered diagram will show:
- **Classes**: Rectangular boxes with three sections (name, attributes, methods)
- **Interfaces**: Boxes labeled with `<<interface>>`
- **Abstract Classes**: Class name in italics or with `{abstract}` stereotype
- **Composition**: Line with filled diamond (◆→) or `*--`
- **Aggregation**: Line with hollow diamond (◇→) or `o--`
- **Inheritance**: Line with hollow triangle arrow (△→) or `<|--`
- **Interface Realization**: Dashed line with hollow triangle (△---) or `<|..`
- **Multiplicities**: Numbers at relationship ends (e.g., 1, 0..*, 1..*)
- **Visibility**: + (public), - (private), # (protected)

## Text-Based Preview

If you can't render PlantUML, see `diagram_visualization.md` for a text-based representation of the structure.

## Troubleshooting

### "Cannot find Java"
- Install Java JRE: `sudo apt-get install default-jre` (Linux)
- Or use the online editor (Option 1)

### "Preview doesn't work in VS Code"
- Make sure the PlantUML extension is installed
- Try using the online editor as a fallback

### "Diagram looks different than expected"
- Make sure you copied the entire content of SmartHomePro.puml
- Check that no lines were truncated during copy/paste

## Need Help?

- Check the README.md for detailed documentation
- Review ANALYSIS_ANSWERS.md for design explanations
- See REQUIREMENTS_CHECKLIST.md to verify all requirements are met
