= Git =

* Create a branch
```
git checkout -b branch_name
```

* Commit small changes
```
git commit --amend
```

= Linux =

* To set a environment variable temporarily (note: do not put space between):
```
export VAR=123
```

* To add /mypath to the beginning of the environment path:
```
export PATH="/mypath:$PATH"
```

* To add /mypath to the end of the environment path:
```
export PATH="$PATH:/mypath"
```

* To write to the bash_profile file:
```
echo 'export PATH=/apollo/env/SDETools/bin:$PATH' >> ~/.bash_profile
```

Create a file: touch

ps [options]	Display a snapshot of the currently running processes.

grep [options] pattern [filesname]	Search files or output for a particular pattern.

chmod [options] mode filename	Change a file’s permissions.

chown [options] filename	Change who owns a file.

cp [options] source destination	Copy files and directories.

kill [options] pid	Stop a process. If the process refuses to stop, use kill -9 pid.

ls [options]	List directory contents.

mkdir [options] directory	Create a new directory.

mv [options] source destination	Rename or move file(s) or directories.

rmdir [options] directory	Delete empty directories.



