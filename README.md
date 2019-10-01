## Towny Advanced - Developed by [LlmDl](https://github.com/LlmDl)

___

<p><img align=right src="https://user-images.githubusercontent.com/879756/65964696-19d6b300-e423-11e9-9cb0-d193225ee40f.png">
I took over from ElgarL after MC 1.8 was released. Past developers have included: Shadeness, FuzzieWuzzie, ElgarL. 
With help coming from other developers from time to time including dumptruckman, ole8pie, SwearWord, gravypod, andrewyunt and more.

Towny is one of the oldest still-in-development plugins for Minecraft. It was created by Shadeness for the now-defunct server platform called hMod.

It is the second-oldest land protection plugin to become popular for Minecraft, having been beaten by WorldGuard by just a couple months. Go check out some of the [features](https://github.com/TownyAdvanced/Towny/wiki#features) Towny has and see why it's still popular for yourself.
</p>

___

### Current Recommended Versions

| Minecraft Version | Towny Version |
|:----:|:----:|
| MC 1.14.* | [Latest Release](https://github.com/TownyAdvanced/Towny/releases) |
| MC 1.13.2 | [0.94.0.0](https://github.com/TownyAdvanced/Towny/releases/tag/v0.94.0.0) |
| MC 1.12.2 | [0.93.1.0 for 1.12.2](http://towny.palmergames.com/file-repo/Towny%20Advanced/Releases/0.93.1.0%20for%201.12.2/) |
| MC 1.11.2 | [0.93.1.0 for 1.11.2](http://towny.palmergames.com/file-repo/Towny%20Advanced/Releases/0.93.1.0%20for%201.11.2/) |
| MC 1.10.2 | [0.93.1.0 for 1.10.2](http://towny.palmergames.com/file-repo/Towny%20Advanced/Releases/0.93.1.0%20for%201.10.2/) |
| MC 1.9.4 | [0.93.1.0 for 1.9.4](http://towny.palmergames.com/file-repo/Towny%20Advanced/Releases/%200.93.1.0%20for%201.9.4/) |
| MC 1.8.9 | [0.93.1.0 for 1.8.9](http://towny.palmergames.com/file-repo/Towny%20Advanced/Releases/0.93.1.0%20for%201.8.9/) |
| MC 1.7.10 | [0.92.0.0 for 1.7.10](http://towny.palmergames.com/file-repo/Towny%20Advanced/Releases/0.92.0.0%20%28For%20MC%201.7.10%29/) |
| MC 1.6.4 | [0.88.0.0 for 1.6.4](http://towny.palmergames.com/?p=744) |
| MC 1.5.2 | [0.88.0.0 for 1.5.2](http://towny.palmergames.com/download/towny-advanced-0-88-0-0-cb-1-5-2/) |
| MC 1.2.5 | [0.82.0.0](http://towny.palmergames.com/?p=735) | 

___

### Staying up to date
<p><img align=right src="https://user-images.githubusercontent.com/879756/65964779-3a067200-e423-11e9-9928-938b976af2c2.gif" height="155">
Towny is currently in transition from our website http://palmergames.com/towny to using github for all downloads/documentation.
    
Now that all Release builds and Development builds are being made available here on github's [Releases](https://github.com/TownyAdvanced/Towny/releases) tab I am recommending that server admins "watch" Towny on github. Just click the watch button in the upper right and select "Releases Only".
</p>

___

### Connect/Support
The documentation found on the [Towny Wiki](https://github.com/TownyAdvanced/Towny/wiki) is updated every time a Release version of Towny is put out. If you are using a development build it is expected that you have read the changelog for any important changes since the previous Release build.

Some important pages to look over:
- [Installing Towny](https://github.com/TownyAdvanced/Towny/wiki/Installation)
- [How Towny Works](https://github.com/TownyAdvanced/Towny/wiki/How-Towny-Works)

Here on github's [Issue Tracker](https://github.com/TownyAdvanced/Towny/issues) you can file [bug reports](https://github.com/TownyAdvanced/Towny/issues/new?assignees=&labels=&template=bug_report.md&title=), [feature requests](https://github.com/TownyAdvanced/Towny/issues/new?assignees=&labels=&template=feature_request.md&title=Suggestion%3A+), or just ask [general questions.](https://github.com/TownyAdvanced/Towny/issues/new?assignees=&labels=&template=question.md&title=Question%3A)

If you still need help, join us in our [IRC channel #towny](http://webchat.esper.net/?channels=towny) on the Esper.net network.
If you are a server admin that wants to get cutting edge updates on the development of the plugin and want to help test things before they become public, join us in our [Discord server]( https://discord.gg/gnpVs5m )

If you want to support the developer consider becoming a patron: 
[<img align=right src="https://user-images.githubusercontent.com/879756/65957602-d3795800-e412-11e9-8b27-dda76b6fed13.PNG">](https://www.patreon.com/bePatron?u=25096724)
___

### Contributing
If you'd like to contribute to the Towny code, see the [Contributing.md](https://github.com/LlmDl/Towny/blob/master/.github/CONTRIBUTING.MD).

___

### Licensing

Towny is licensed under the [Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported (CC BY-NC-ND 3.0) License ](http://creativecommons.org/licenses/by-nc-nd/3.0/)

We don't object to you making your own forks and builds but we do object to people being selfish, which is why we specify No Derivative Works.
If you want to modify the code to add some nice feature the least you can do is ask and submit a pull request to allow everyone to benefit from it.

___

### Building
If you would like to build from a specific branch yourself, you can do so with either [Apache Ant](https://ant.apache.org/) or [Apache Maven](http://maven.apache.org/), depending on the age of the branch.

For building, open your terminal / command prompt and navigate to the Towny Directory (either extracted, or cloned).

- **Maven**

    - Run `mvn clean package` to generate the plugin in the `target` directory, within the Towny folder. 
    - Developers may use the following after setting up their github token [as shown here.](https://help.github.com/en/articles/configuring-apache-maven-for-use-with-github-package-registry#authenticating-to-github-package-registry).
        
```
  <repositories>
    <repository>
      <id>github-Towny</id>
      <url>https://maven.pkg.github.com/TownyAdvanced/Towny</url>
    </repository>   
  </repositories>
  <dependencies>                    
    <dependency>
      <groupId>com.palmergames.bukkit.towny</groupId>
      <artifactId>Towny</artifactId>
      <version>0.94.0.12</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>  
```

- **Ant** (_Deprecated_)

    - For older branches using the Ant build system, the main command to use would be: `ant clean jar`. This command will _exit_ the Towny directory, creating a lib folder alongside it. A Towny.jar file will be generated and placed within there.
    - _Note: As Ant is being deprecated, older branches may eventually not be able to be built against without modification of the `build.xml` file. We leave no guarantee that the file repo providing the dependencies will stay up._
