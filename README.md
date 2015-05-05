# java_lessons
This is iguchi's java lessons

## members
* Takashi Iguchi

## files
* HelloWorld.java
* HelloWorld.class

## how to release

## git tips
* git cloneで任意のremote repositoryをlocalにもってくる

```
iguchitakashi@ta-mac $ git clone https://github.com/iguchikoma/java_lessons.git
```
* git cloneを実行したdirectory配下にjava_lessonsというディレクトリができる
* java_lessonsディレクトリに移動してgit checkout -b [branch-name]でブランチを作って、そのブランチへチェックアウトする。今回はbranch名はmethod。

```
iguchitakashi@ta-mac $ cd java_lessons
iguchitakashi@ta-mac $ git checkout -b method
```

* fileを編集
* 編集後は以下のような流れで、git add, git commit, git push origin [branch-name] を実行して、remote repositoryへ変更をpushする

```
iguchitakashi@ta-mac $ git status
On branch method
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   HelloWorld.class
        modified:   HelloWorld.java

no changes added to commit (use "git add" and/or "git commit -a")
iguchitakashi@ta-mac $ git add HelloWorld.*
iguchitakashi@ta-mac $ git status
On branch method
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        modified:   HelloWorld.class
        modified:   HelloWorld.java

iguchitakashi@ta-mac $ git commit HelloWorld.*

  1 Add method
  2 # Please enter the commit message for your changes. Lines starting
  3 # with '#' will be ignored, and an empty message aborts the commit.
  4 # Explicit paths specified without -i or -o; assuming --only paths...
  5 # On branch method
  6 # Changes to be committed:
  7 #>modified:   HelloWorld.class
  8 #>modified:   HelloWorld.java
  9 #
".git/COMMIT_EDITMSG" 9L, 327C written
[method 7a8a6d1] Add method
 2 files changed, 8 insertions(+)
 rewrite HelloWorld.class (64%)
iguchitakashi@ta-mac $ git status
On branch method
nothing to commit, working directory clean
iguchitakashi@ta-mac $ git push origin method
Username for 'https://github.com': iguchikoma
Password for 'https://iguchikoma@github.com':
Counting objects: 4, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 863 bytes | 0 bytes/s, done.
Total 4 (delta 2), reused 0 (delta 0)

To https://github.com/iguchikoma/java_lessons.git
 * [new branch]      method -> method
```

* Github上でpushしたmethod branchをmasterへmergeする旨のpull request
* Github上でmethod branchのcode reviewを行いmasterへmerge
* Github上でmethod branchをdelete
* ここまではGithub上の操作

* 以下参考
* これを全部local repositoryでやるには, git checkout master のあとにgit merge methodとして、その後git push origin masterとして, 最後にmasterをcheckoutしている状態でgit pullして完了。

* その後、localでgit pull --pruneでサーバ(remote repository上でmergeされた後のmasterをtracking branchに持ってきてlocal branchのmasterへmergeした後にgit branch -d [branch-name]でlocalの不要なbranchを消す

```
iguchitakashi@ta-mac $ git branch -a
  master
* method
  remotes/origin/HEAD -> origin/master
  remotes/origin/master
  remotes/origin/method
iguchitakashi@ta-mac $ git checkout master                                                                                                                             [method][~/java_lessons]
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.
iguchitakashi@ta-mac $ git pull
remote: Counting objects: 1, done.
remote: Total 1 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (1/1), done.
From https://github.com/iguchikoma/java_lessons
   d800326..9628b9f  master     -> origin/master
First, rewinding head to replay your work on top of it...
Fast-forwarded master to 9628b9f65f840ffda7ecdfab884f02919a1dd8ca.
iguchitakashi@ta-mac $ git status
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean
iguchitakashi@ta-mac $ git branch -a
* master
  method
  remotes/origin/HEAD -> origin/master
  remotes/origin/master
  remotes/origin/method
iguchitakashi@ta-mac $ git branch -d method
Deleted branch method (was 7a8a6d1).
iguchitakashi@ta-mac $                                                                                                                                                 [master][~/java_lessons]
iguchitakashi@ta-mac $ git branch -a
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master
  remotes/origin/method
iguchitakashi@ta-mac $ git pull
Current branch master is up to date.
iguchitakashi@ta-mac $ git branch -a
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master
  remotes/origin/method
iguchitakashi@ta-mac $ git pull --prune
From https://github.com/iguchikoma/java_lessons
 x [deleted]         (none)     -> origin/method
Current branch master is up to date.
iguchitakashi@ta-mac $                                                                                                                                                 [master][~/java_lessons]
iguchitakashi@ta-mac $ git branch -a
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master
```

* 参考URL
http://d.hatena.ne.jp/hokaccha/20120404/1333507076
http://qiita.com/Teloo/items/95a860ae276b49edb040
http://tweeeety.hateblo.jp/entry/2014/11/19/235517

* その他git addとgit commitを同時に行うにはgit commit -am "commitのcomment...."とすればOK
