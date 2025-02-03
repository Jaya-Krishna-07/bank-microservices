import os

# List of example directory names
example_dirs = ["audit", "constants", "controller", "dto", "entity", "exception", "mapper", "repository", "service"]

# Loop through the example directory names and create them
for dir_name in example_dirs:
    if not os.path.exists(dir_name):
        os.makedirs(dir_name)
        print(f"Created directory: {dir_name}")
    else:
        print(f"Directory already exists: {dir_name}")
