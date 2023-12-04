# download.py

import requests
import os
from datetime import datetime

def download_html(url):
    try:
        response = requests.get(url)
        response.raise_for_status()  # Check if the request was successful
        return response.text
    except requests.exceptions.RequestException as e:
        print(f"Error: {e}")
        return None

def save_to_txt(html_content, file_path):
    try:
        with open(file_path, 'w', encoding='utf-8') as file:
            file.write(html_content)
        print(f"HTML content successfully saved to {file_path}")
    except Exception as e:
        print(f"Error saving to file: {e}")

def download_and_save():
    # Get today's date in the format MM/DD/YYYY
    today_date = datetime.today().strftime('%m/%d/%Y')

    # Replace 'https://www.sagedining.com/microsites/getMenuItems?menuId=120070&date=11/17/2023&meal=Lunch' with your URL
    url = f'https://www.sagedining.com/microsites/getMenuItems?menuId=120070&date={today_date}&meal=Lunch'
    html_content = download_html(url)

    if html_content:
        file_path = 'output.txt'
        if os.path.exists(file_path):
            os.remove(file_path)
        save_to_txt(html_content, file_path)
    else:
        print("Failed to download HTML.")
