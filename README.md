# GeneralDebugger: DebugTool

## Overview

`DebugTool` is a lightweight, general-purpose debugging utility designed to assist developers in identifying and resolving issues in their Python applications. Part of the `GeneralDebugger` repository, this tool provides features such as logging, breakpoint management, and runtime inspection to streamline the debugging process. It is ideal for developers seeking a simple yet effective tool to debug Python scripts or applications.

## Features

- **Logging Support**: Capture detailed logs of application execution for post-mortem analysis.
- **Breakpoint Management**: Set and manage breakpoints programmatically or via a command-line interface.
- **Runtime Inspection**: Inspect variables, stack traces, and runtime state during execution.
- **Extensible**: Easily integrate with existing Python projects or extend with custom debugging logic.
- **Cross-Platform**: Compatible with Windows, macOS, and Linux.

## Prerequisites

Before using `DebugTool`, ensure you have the following installed:

- **Python**: Version 3.8 or higher ([Install Python](https://www.python.org/downloads/))
- **pip**: Python package manager (included with Python)
- A code editor or IDE (e.g., VS Code, PyCharm) for modifying and running scripts
- (Optional) Git, for cloning the repository

## Installation

### Clone the Repository

```bash
git clone https://github.com/pradeep515/GeneralDebugger.git
cd GeneralDebugger/debugtool
```

### Install Dependencies

Install required Python packages using pip:

```bash
pip install -r requirements.txt
```

If no `requirements.txt` is present, the tool may rely on Python’s standard library. Check the project files or update this section with specific dependencies.

### Verify Installation

Run the debug tool with the help command to ensure it’s installed correctly:

```bash
python debugtool.py --help
```

## Usage

`DebugTool` can be used as a command-line utility or imported as a module in your Python scripts. Below are common usage examples.

### Command-Line Usage

Run the tool to debug a Python script:

```bash
python debugtool.py path/to/your_script.py
```

Enable verbose logging:

```bash
python debugtool.py --verbose path/to/your_script.py
```

Set a breakpoint at a specific line:

```bash
python debugtool.py --breakpoint path/to/your_script.py:42
```

See `python debugtool.py --help` for all available options.

### As a Python Module

Import `DebugTool` in your Python code to add debugging capabilities:

```python
from debugtool import Debugger

# Initialize the debugger
debugger = Debugger(log_level="DEBUG")

# Set a breakpoint
debugger.set_breakpoint("my_function")

# Run your code
debugger.run("path/to/your_script.py")
```

Refer to the `examples/` directory (if available) for additional usage scenarios.

## Directory Structure

```
GeneralDebugger/debugtool/
├── debugtool.py            # Main debugging script
├── examples/               # Example scripts demonstrating usage
├── tests/                  # Unit tests for the tool
├── requirements.txt        # Python dependencies
└── README.md               # Project documentation
```

## Configuration

Customize `DebugTool` by modifying configuration settings, if available. For example, create a `config.json` or update settings in `debugtool.py`:

```json
{
  "log_level": "DEBUG",
  "log_file": "debug.log",
  "breakpoints": []
}
```

Check the project files for specific configuration options.

## Testing

Run unit tests to verify the tool’s functionality:

```bash
python -m unittest discover tests
```

Ensure all tests pass before deploying in a production environment.

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m "Add your feature"`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a pull request.

Please include tests for new features and follow Python PEP 8 style guidelines.


## Contact

For questions or support, please open an issue on the [GitHub repository](https://github.com/pradeep515/GeneralDebugger) or contact [pradeep515](https://github.com/pradeep515).