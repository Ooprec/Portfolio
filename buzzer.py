import time

class QuizBowlBuzzer:
    def __init__(self, num_teams=2, buzzers_per_team=5):
        self.num_teams = num_teams
        self.buzzers_per_team = buzzers_per_team
        self.buzzers = [[False] * buzzers_per_team for _ in range(num_teams)]
        self.central_input = False

    def reset_buzzers(self):
        self.buzzers = [[False] * self.buzzers_per_team for _ in range(self.num_teams)]
        self.central_input = False

    def check_buzzer(self, team, buzzer_number):
        if not self.central_input:
            if not self.buzzers[team][buzzer_number]:
                self.buzzers[team][buzzer_number] = True
                return True
        return False

    def set_central_input(self, status):
        self.central_input = status

def main():
    buzzer_system = QuizBowlBuzzer()

    while True:
        try:
            team = int(input("Enter team number (0-indexed): "))
            buzzer_number = int(input("Enter buzzer number (0-indexed): "))

            if 0 <= team < buzzer_system.num_teams and 0 <= buzzer_number < buzzer_system.buzzers_per_team:
                if buzzer_system.check_buzzer(team, buzzer_number):
                    print(f"Team {team + 1}'s buzzer {buzzer_number + 1} is active!")

                    central_input = input("Enter central input (Y/N): ").upper()
                    if central_input == 'Y':
                        buzzer_system.set_central_input(True)
                        print("Central input received. Buzzers locked until reset.")
                        break

        except ValueError:
            print("Invalid input. Please enter valid integers for team and buzzer numbers.")

if __name__ == "__main__":
   main()