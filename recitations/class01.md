CSCI 3155 Programming Languages Recitation
==========================================

TA: Jedidiah (Jed) McClurg
--------------------------

1. Introduction
    1. About Me
        1. I'm Jed McClurg, a Ph.D. student in the Programming Languages and Verification (CUPLV) group.
        2. Contact me at jrmcclurg@gmail.com
    2. About the Class
2. Important Notes
    1. My office hours will be announced ASAP (I'll send you all email)
    2. There should be no cheating in this class (we can easily detect it)!
    3. Students will need to work in groups of 2 or 3 (no exceptions).
    4. PIAZZA will be the primary way you communicate with the course instructors regarding questions, etc. (Log in ASAP!)
3. Students Introduction
    1. I would like to learn your names, so maybe we'll have each person briefly introduce themself.
4. Installing Linux VM
    1. I recommend installing an Ubuntu Virtual Machine (VM) on your computer of choice:
        1. Get VirtualBox installed on your computer: https://www.virtualbox.org/wiki/Downloads 
        2. Download an Ubuntu ISO image from http://www.ubuntu.com (should be a large .ISO file)
        3. Start up VirtualBox and "install" the ISO image
        4. You should now have a Linux "desktop" inside a window on your computer!
5. Markdown (Basic Overview)
    1. Install the tools: `sudo apt-get install pandoc latex-beamer`
    2. Now you can compile a markdown document to a PDF by doing something like:
    `pandoc -f markdown -V theme:PaloAlto --write beamer -o myfile.pdf myfile.md`
6. SSH Keys
    1. Create your own public/private key pair:
    `ssh-keygen -t rsa -C "jrmcclurg@gmail.com"`
    2. It will ask for a name, and a password
    3. You can hit return when it asks for a name, and it will use the default, which is `~/.ssh/id_rsa.pub` for the public key and `~/.ssh/id_rsa` for the private key.
    4. KEEP YOUR PRIVATE KEY SAFE (don't share it or post it anywhere).
7. Version Control
    1. Install git: `sudo apt-get install git gitk`
    2. GitHub (create an account, and maybe a test repository). https://github.com
    3. Make sure your username/ID is reasonably professional :)  You may want to use this in the future to store your work, and you don't want potential employers seeing a weird name!
    4. Install your PUBLIC KEY into your GitHub Account (this will let you authenticate)
    5. Clone your github repo onto your local machine.  Please try it with mine: `git clone git@github.com:jrmcclurg/csci3155.git`
    6. Each "version" in git is called a "commit"
    7. You can look at the commit history by doing `git log`
    8. You can make a file `myfile.blah` "tracked" (i.e. version-controlled) by git if you do `git add myfile.blah`
    9. You can make a new commit by doing `git commit -a -m "Some short message describing what changes you're committing"`
    10. You can push your changes to the remote repository (in this case, GitHub) by doing `git push`
    11. You can pull in changes which others have pushed to your remote repository by doing `git pull`
    12. You can look at a previous version by doing `git checkout <ID>` where `<ID>` is the commit ID you want.
        1. This gets you in a "disconnected head" state, so don't make any commits here without creating a new branch!
        2. To get back to where you were, do `git checkout master`
    13. GitHub pull requests!! (We didn't have time for this yet)
8. Test-driven Development (TDD)
    * We didn't have time for this yet
9. Intro. to Functional Programming (and Scala)
    * We didn't have time for this yet
