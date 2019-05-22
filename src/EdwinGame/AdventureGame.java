package EdwinGame;

import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, there! \n" +
                "Happy to meet you! \n" +
                "Welcome to the world of POKEMON! \n" +
                "My name is OAK. \n" +
                "People affectionately refer to me as the POKEMON PROFESSOR.\n" +
                "This world…… \n" +
                "is inhabited far and wide by creatures called POKEMON.\n" +
                "For some people, POKEMON are pets. \n" +
                "Others use them for battling. \n" +
                "As for myself… \n" +
                "I study POKEMON as a profession.\n" +
                "But first, tell me a little about yourself.\n" +
                "Lets start with your name. What is it?");
        String heroName = sc.next();
        System.out.printf("Right… \n" +
                "So your name is %s.%n", heroName);
        System.out.println("This is my grandson. He's been your rival since you were both babies. \n" +
                "… Erm, what was his name now?");
        String rivalName = sc.next();
        System.out.printf("… There, was it %s.%n", rivalName);
        System.out.printf("That's right! I remember now! \n" +
                "His name is %s.%n", rivalName);
        System.out.println("Your very own POKEMON legend is about to unfold! \n" +
                "A world of dreams and adventures with POKEMON  awaits! Let's go! ");

        System.out.printf("Here, %s! There are 3 POKEMON here! Haha! \n" +
                "They are inside the POKE BALLS. \n" +
                "When I was young, I was a serious POKEMON trainer.\n" +
                "In my old age, I have only 3 left, but you can have one! Choose!\n" +
                "%s: Hey! Gramps! What about me?\n" +
                "Oak: Be patient!, you can have one too!\n", heroName, rivalName);
        System.out.printf("Now, %s, which POKEMON do you want? The three available Pokemon are Bulbasaur, Charmander, and Squirtle.%n", heroName);
        String partner = sc.next();
        if (partner.length() == 8) {
            System.out.print("Oak: So! You want Squirtle.\n" +
                    "               _,........__\n" +
                    "            ,-'            \"`-.\n" +
                    "          ,'                   `-.\n" +
                    "        ,'                        \\\n" +
                    "      ,'                           .\n" +
                    "      .'\\               ,\"\".       `\n" +
                    "     ._.'|             / |  `       \\\n" +
                    "     |   |            `-.'  ||       `.\n" +
                    "     |   |            '-._,'||       | \\\n" +
                    "     .`.,'             `..,'.'       , |`-.\n" +
                    "     l                       .'`.  _/  |   `.\n" +
                    "     `-.._'-   ,          _ _'   -\" \\  .     `\n" +
                    "`.\"\"\"\"\"'-.`-...,---------','         `. `....__.\n" +
                    ".'       `\"-..___      __,'\\          \\  \\     \\\n" +
                    "\\_ .         |   `\"\"\"\"'    `.           . \\     \\\n" +
                    "  `.          |              `.          |  .     L\n" +
                    "    `.        |`--...________.'.        j   |     |\n" +
                    "      `._    .'      |          `.     .|   ,     |\n" +
                    "         `--,\\       .            `7\"\"' |  ,      |\n" +
                    "            ` `      `            /     |  |      |    _,-'\"\"\"`-.\n" +
                    "             \\ `.     .          /      |  '      |  ,'          `.\n" +
                    "              \\  v.__  .        '       .   \\    /| /              \\\n" +
                    "               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n" +
                    "                `        .        `._ ___,j.  `/ .-       ,---.     |\n" +
                    "                ,`-.      \\         .\"     `.  |/        j     `    |\n" +
                    "               /    `.     \\       /         \\ /         |     /    j\n" +
                    "              |       `-.   7-.._ .          |\"          '         /\n" +
                    "              |          `./_    `|          |            .     _,'\n" +
                    "              `.           / `----|          |-............`---'\n" +
                    "                \\          \\      |          |\n" +
                    "               ,'           )     `.         |\n" +
                    "                7____,,..--'      /          |\n" +
                    "                                  `---.__,--.'\n" +
                    "Oak: You chose a water type.");
        } else if (partner.length() == 9) {
            System.out.println("Oak: So! You want Bulbasaur.\n" +
                    "                                           /\n" +
                    "                        _,.------....___,.' ',.-.\n" +
                    "                     ,-'          _,.--\"        |\n" +
                    "                   ,'         _.-'              .\n" +
                    "                  /   ,     ,'                   `\n" +
                    "                 .   /     /                     ``.\n" +
                    "                 |  |     .                       \\.\\\n" +
                    "       ____      |___._.  |       __               \\ `.\n" +
                    "     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\\n" +
                    "    .  ,            __               `              |   .\n" +
                    "    `,'         ,-\"'  .               \\             |    L\n" +
                    "   ,'          '    _.'                -._          /    |\n" +
                    "  ,`-.    ,\".   `--'                      >.      ,'     |\n" +
                    " . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'\n" +
                    " ||:, .           ,'  ;  /  / \\ `        `.    .      .'/\n" +
                    " j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /\n" +
                    "/ L:_  |                 .  \"' :_;                `.'.'\n" +
                    ".    \"\"'                  \"\"\"\"\"'                    V\n" +
                    " `.                                 .    `.   _,..  `\n" +
                    "   `,_   .    .                _,-'/    .. `,'   __  `\n" +
                    "    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .\n" +
                    "   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |\n" +
                    "  .   _  `\"\"'--.._____..--\"   ,             '         |\n" +
                    "  | .\" `. `-.                /-.           /          ,\n" +
                    "  | `._.'    `,_            ;  /         ,'          .\n" +
                    " .'          /| `-.        . ,'         ,           ,\n" +
                    " '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'\n" +
                    " `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--'\n" +
                    "Oak: You chose a leaf type.");
        } else if (partner.length() == 10) {
            System.out.println("Oak: So! You want Charmander.\n" +
                    "              _.--\"\"`-..\n" +
                    "            ,'          `.\n" +
                    "          ,'          __  `.\n" +
                    "         /|          \" __   \\\n" +
                    "        , |           / |.   .\n" +
                    "        |,'          !_.'|   |\n" +
                    "      ,'             '   |   |\n" +
                    "     /              |`--'|   |\n" +
                    "    |                `---'   |\n" +
                    "     .   ,                   |                       ,\".\n" +
                    "      ._     '           _'  |                    , ' \\ `\n" +
                    "  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|\n" +
                    "  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\\n" +
                    "-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .\n" +
                    "  `,         \"\"\"\"'     `.              ,'         |   |  ',,\n" +
                    "    `.      '            '            /          '    |'. |/\n" +
                    "      `.   |              \\       _,-'           |       ''\n" +
                    "        `._'               \\   '\"\\                .      |\n" +
                    "           |                '     \\                `._  ,'\n" +
                    "           |                 '     \\                 .'|\n" +
                    "           |                 .      \\                | |\n" +
                    "           |                 |       L              ,' |\n" +
                    "           `                 |       |             /   '\n" +
                    "            \\                |       |           ,'   /\n" +
                    "          ,' \\               |  _.._ ,-..___,..-'    ,'\n" +
                    "         /     .             .      `!             ,j'\n" +
                    "        /       `.          /        .           .'/\n" +
                    "       .          `.       /         |        _.'.'\n" +
                    "        `.          7`'---'          |------\"'_.'\n" +
                    "       _,.`,_     _'                ,''-----\"'\n" +
                    "   _,-_    '       `.     .'      ,\\\n" +
                    "   -\" /`.         _,'     | _  _  _.|\n" +
                    "   \"\"--'---\"\"\"\"\"'         `' '! |! /\n" +
                    "                            `\" \" -'\n" +
                    "Oak: You chose a fire type.");
        }
    }
}
