```
~/tmp/test(master ✔) sbt
[info] Loading settings from idea.sbt,plugins.sbt ...
[info] Loading global plugins from /Users/heiko/.sbt/1.0/plugins
[info] Loading project definition from /Users/heiko/tmp/test/project
[info] Updating ProjectRef(uri("file:/Users/heiko/tmp/test/project/"), "test-build")...
[info] Done updating.
update[info] Loading settings from build.sbt ...
[info] Set current project to test (in build file:/Users/heiko/tmp/test/)
[info] sbt server started at local:///Users/heiko/.sbt/1.0/server/c526e3d88c5e5d800d15/sock
sbt:test> update
[info] Updating ...
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 	::          UNRESOLVED DEPENDENCIES         ::
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 	:: com.typesafe.akka#akka-actor-typed_2.12;2.5-20180202-180000: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn]
[warn] 	Note: Unresolved dependencies path:
[warn] 		com.typesafe.akka:akka-actor-typed_2.12:2.5-20180202-180000 (/Users/heiko/tmp/test/build.sbt#L3-6)
[warn] 		  +- default:test_2.12:0.1.0-SNAPSHOT
[error] sbt.librarymanagement.ResolveException: unresolved dependency: com.typesafe.akka#akka-actor-typed_2.12;2.5-20180202-180000: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[error] 	at sbt.internal.librarymanagement.IvyActions$.resolveAndRetrieve(IvyActions.scala:331)
[error] 	at sbt.internal.librarymanagement.IvyActions$.$anonfun$updateEither$1(IvyActions.scala:205)
[error] 	at sbt.internal.librarymanagement.IvySbt$Module.$anonfun$withModule$1(Ivy.scala:243)
[error] 	at sbt.internal.librarymanagement.IvySbt.$anonfun$withIvy$1(Ivy.scala:204)
[error] 	at sbt.internal.librarymanagement.IvySbt.sbt$internal$librarymanagement$IvySbt$$action$1(Ivy.scala:70)
[error] 	at sbt.internal.librarymanagement.IvySbt$$anon$3.call(Ivy.scala:77)
[error] 	at xsbt.boot.Locks$GlobalLock.withChannel$1(Locks.scala:95)
[error] 	at xsbt.boot.Locks$GlobalLock.xsbt$boot$Locks$GlobalLock$$withChannelRetries$1(Locks.scala:80)
[error] 	at xsbt.boot.Locks$GlobalLock$$anonfun$withFileLock$1.apply(Locks.scala:99)
[error] 	at xsbt.boot.Using$.withResource(Using.scala:10)
[error] 	at xsbt.boot.Using$.apply(Using.scala:9)
[error] 	at xsbt.boot.Locks$GlobalLock.ignoringDeadlockAvoided(Locks.scala:60)
[error] 	at xsbt.boot.Locks$GlobalLock.withLock(Locks.scala:50)
[error] 	at xsbt.boot.Locks$.apply0(Locks.scala:31)
[error] 	at xsbt.boot.Locks$.apply(Locks.scala:28)
[error] 	at sbt.internal.librarymanagement.IvySbt.withDefaultLogger(Ivy.scala:77)
[error] 	at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:199)
[error] 	at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:196)
[error] 	at sbt.internal.librarymanagement.IvySbt$Module.withModule(Ivy.scala:242)
[error] 	at sbt.internal.librarymanagement.IvyActions$.updateEither(IvyActions.scala:190)
[error] 	at sbt.librarymanagement.ivy.IvyDependencyResolution.update(IvyDependencyResolution.scala:20)
[error] 	at sbt.librarymanagement.DependencyResolution.update(DependencyResolution.scala:56)
[error] 	at sbt.internal.LibraryManagement$.resolve$1(LibraryManagement.scala:46)
[error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$12(LibraryManagement.scala:99)
[error] 	at sbt.util.Tracked$.$anonfun$lastOutput$1(Tracked.scala:68)
[error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$19(LibraryManagement.scala:112)
[error] 	at scala.util.control.Exception$Catch.apply(Exception.scala:224)
[error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11(LibraryManagement.scala:112)
[error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11$adapted(LibraryManagement.scala:95)
[error] 	at sbt.util.Tracked$.$anonfun$inputChanged$1(Tracked.scala:149)
[error] 	at sbt.internal.LibraryManagement$.cachedUpdate(LibraryManagement.scala:126)
[error] 	at sbt.Classpaths$.$anonfun$updateTask$5(Defaults.scala:2383)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:39)
[error] 	at sbt.std.Transform$$anon$4.work(System.scala:66)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:262)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error] 	at sbt.Execute.work(Execute.scala:271)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:262)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:174)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:36)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:514)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
[error] 	at java.base/java.lang.Thread.run(Thread.java:844)
[error] (update) sbt.librarymanagement.ResolveException: unresolved dependency: com.typesafe.akka#akka-actor-typed_2.12;2.5-20180202-180000: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[error] Total time: 2 s, completed 13 Feb 2018, 10:26:06
```
