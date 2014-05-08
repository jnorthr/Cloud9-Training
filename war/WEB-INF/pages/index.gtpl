<% include '/WEB-INF/includes/header.gtpl' %>

<h1>Welcome</h1>

<p>Congratulations!  You've just deployed your first <img src="/images/anynines.png" width=20px> Anynines application to our Cloud Foundry platform.</p>
 
<h1>Quick Start</h1>
<p>We want to give you a short-cut to help get your web application running on Anynines. Typically, we manage applications on the Anynines platform using tools on our local client machines. This is done in either of two ways.

<h2>Install A Deployment Tool</h2>
<p>You can install and manually use a deployment tool. We suggest a tool named <b>CF</b> - for 'Cloud Foundry'. It has a lot of flexibility to help you manage your applications on Anynines. It's for serious use and can be a bit of effort to get it running. Often, you may not even know if our Anynines services are what you need. Sure <b>CF</b> is great when you are really into building apps, but there is a short-cut.</p>
<p>By-the-way, if you really want to dig into the <b>CF</b> life-style, <a href="http://www.slideshare.net/anynines/getting-started-with-anynines">look here for an overview</a> and/or these <a href="https://support.anynines.com/entries/24083808-How-to-deploy-your-apps-on-anynines">detailed instructions</a> to find and install the <b>CF</b> toolkit.</p>


<h2>Use A Build Tool</h2>

<p>Build tools are more automatic. They can flatten the learning curve with a new product. Build tools like <a href="http://ant.apache.org">Ant</a>, or an <a href="http://en.wikipedia.org/wiki/Integrated_development_environment">IDE</a> tool like <a href="https://netbeans.org">Netbeans</a> or <a href="https://www.eclipse.org">Eclipse</a> can help you a lot, but we've found a shiny new feature in a build tool called <b><a href="http://www.gradle.org/"><img src="/images/gradle-logo.png" width=45px> Gradle.</a></b> Their current version is 1.11. Gradle can extend it's feature set via plug-ins, and it has a nice new plugin feature we can use to quickly deploy an application. That plug-in is the Cloud Foundry plugin for Gradle. <a href="http://docs.cloudfoundry.org">Read details here</a> and <a href="http://blog.anynines.com/using-gradle-cloud-foundry-plugin-to-target-anynines-non-pivotal-address-james-northrop/">here.</a></p>
<p>With this plugin, you won't need to install <b>CF</b> now. When running, this plugin behaves exactly as though you had entered <b>CF</b> commands manually.</p>

<p>So this is the short-cut we will take.</p>
<br />
<hr width="50%" />
<br />
<h3>What You Need</h3>
<p>If you care to try out this short-cut, you'll need a few things.
<ul>
<li>Ability to work directly with your operating system at the command line. On Windows systems, you should be comfortable using a command prompt window. Apple and Linux users will need to use their terminal consoles.</li>
<li>Be able to change directories when needed.</li>
<li>Use a text editor.</li>
<li>Have a membership account with Anynines. Follow our <a href="/signup">Sign Up</a> tutorial above if you need to join.</li>
<li>Have the email address and password of your Anynines membership.</li>
<li>Have a working internet connection.</li>
<li>Possess a recent java runtime environment. You can check this from a command prompt using the command:<br /><code>java -version</code><br />versions 1.5, 1.6 and 1.7 are ok though earlier versions may not work. You need one of these Java JRE (java Runtime Environment) versions installed on your system before Gradle will run. It's beyond the scope of this guide to talk about JRE installations.</li>
</ul>
</p>

<p>Ok, that's it ! We're ready to rock !</p>
<p>We've spent time making a pre-built sample application ( app ) for you.</p>
<p>To download our sample, please click <a href="/download">Download</a> above. It's a fresh copy and it's almost ready to deploy. Just needs your credentials and app name, really. We'd suggest you avoid making any other changes until you've been successful in uploading and testing your new application.</p>
<p>Actually, our sample <b>IS</b> this website you're now viewing. So, by looking into our sample code and pieces, and matching them against what you see here, you'll be able to get the hang of it all quicker.</p>
<p class="orange" >Good Luck !</p>

<% include '/WEB-INF/includes/footer.gtpl' %>

