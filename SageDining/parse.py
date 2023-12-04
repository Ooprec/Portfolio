# parse.py

def find_start_index(file_path, search_string):
    try:
        with open(file_path, 'r', encoding='utf-8') as file:
            html_content = file.read()

        # Find the starting index of the raw search string
        start_index = html_content.find(search_string)

        if start_index != -1:
            return start_index
        else:
            print(f"'{search_string}' not found in the HTML content.")
    except FileNotFoundError:
        print(f"File '{file_path}' not found.")
    except Exception as e:
        print(f"Error reading file: {e}")
        4

def getRawEntrees(filename, startIndex):
    openBrackets = 0
    closeBrackets = 0
    position = startIndex-1
    done = False
    output = ""
    
    with open(filename, 'r', encoding='utf-8') as file:
            html_content = file.read()
    while not done:
        if html_content[position] == "[":
            openBrackets+=1
        elif html_content[position] == "]":
            closeBrackets+=1
        output+=html_content[position]
        
        if position > startIndex and closeBrackets == openBrackets and closeBrackets != 0:
            done = True
        position += 1
    print(output)
    return output

# Example usage
if __name__ == "__main__":
    from download import download_and_save

    download_and_save()  # Call the download_and_save function from download.py
    from parse import find_start_index
    from download import save_to_txt
    save_to_txt(getRawEntrees("output.txt",find_start_index('output.txt', 'Entr\\u00e9es')),"output2.txt")
    

    # find_start_index('output.txt', 'Entr\\u00e9es')  # Note the double backslash to represent a single backslash in the raw string
