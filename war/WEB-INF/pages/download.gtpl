<% include '/WEB-INF/includes/header.gtpl?title=Download' %>

<h1>Your Download Tutorial</h1>

<h2>Purpose</h2>
<p>To give you some pre-built pieces of software. These pieces have been put together properly to enable you to get started more quickly without needing to do much yourself.</p>

<h2>What You Need</h2>
<div id="sidebox" class="roundPinkBorder shadow">
    <table>
        <tr>
            <td><a href="/anynines.zip"><img src="/images/icon-download.png" alt="Anynines complete project"></a></td>
            <td><a href="/anynines.zip">Anynines.zip</a></td>
        </tr>
        <tr>
            <td><a href="/anynines.war"><img src="/images/icon-download.png" alt="sample war file"></a></td>
            <td><a href="/anynines.war">Anynines Sample.war</a></td>
        </tr>
    </table>
</div>
<ul>
<li>Have a membership account with Anynines. Follow our <a href="/signup">Sign Up</a> tutorial if you need to join us.</li>
<li>Have the email address and password of your Anynines membership.</li>
<li>Have a working internet connection.</li>
<li>Have some spare disk space.</li>
<li>Have a utility to unzip our compressed zip file.</li>
</ul>

<h2>It's Your Choice</h2>
<p>If you're a hot hacker and like to work at the command line, go manual and follow the next steps. If you're impatient (or lazy), take the high road and choose the gradle auto-pilot.</p>


<h3>CF Deployment Tool</h3>
<div style="float: right; margin: 0px 0px 0px 20px;"><img class="shadow" src="/images/download1a.png"  width="627" border="1" alt="download sample war file"></div>
<p>If you've already installed the <b>CF</b> command-line tool, then you should take the sample war file ( see right ). 
(To install the <b>CF</b> tool, follow our links on our <a href="/">home page</a> or <a href="https://anynines.zendesk.com/entries/60241846-How-to-install-the-CLI-v6">read this</a>.) 
<p>It's a file with all the pieces you'll need to successfully deploy an app to Anynines. 
It doesn't have the extra bits to automate the build/re-build or automatic upload to our anynines servers.</p> 
<p>If you want to build this app or tinker a bit, you'll need the zip file. Or you can take both <span class="orange">:-)</span></p>

<br style="clear: both;" />&nbsp;<br />

<div style="float: left; margin: 0px 20px 0px 0px;"><img class="shadow" src="/images/grabwar.png"  width="418" border="1" alt="download sample war file"></div>

<p>When your browser finishes the download, open the containing folder where your browser put our war file. You can try an upload to anynines from that folder, or you might want to make another folder somewhere else on your system, then copy or move the sample war file to your new folder. </p><p>After that read our <a href="/upload">Upload</a> tutorial.</p>

<br  style="clear: both;" />&nbsp;<br />
<div style="width:50%; margin-left:auto; margin-right:auto;"><img class="shadow" src="/images/warindownloads.png"  border="1"></div>

<br  style="clear: both;" />&nbsp;<br />

<hr width="50%" />

<br />&nbsp;<br />

<h3>Gradle Automated Build and Deployment Tool</h3>
<div style="float: right; margin: 5px 0px 0px 20px;"><img class="shadow" src="/images/download1b.png"  width="627" border="1" alt="download sample war file"></div>

<p>To try this approach, you'll need the zip file. Look at the top right of this page for our Anynines zip entry. Click on that to start the download into your sytem.</p> 
<p>Our zip file has everything we put in the web archive ( .war ) file plus some extra bits you'll need to deploy this application.</p>

<p>You might want to make another folder somewhere else on your system, then copy or move our zip file to your new folder. 
You'll need to unzip the file when you have it where you want it.</p> 
<p>Our project file structure follows the typical folder structure used in build tools like maven and gradle. Look at our upload page for a typical layout.</p>

<p>After that, read our <a href="/upload">Upload</a> tutorial.</p>

<br style="clear: both;" />

<br />&nbsp;<br />

<hr width="50%" />


<h3>Artifacts</h3>
<ul>
    <li>Anynines WAR: <a href="/anynines.war">Anynines Sample.war</a> is a deployable war file packaged according to standards. Use the <b>CF</b> tool to push it to our servers.</li>
    <li>Anynines ZIP: <a href="/anynines.zip">A zip file</a> with this project compressed into .zip archive. It has the complete content of the website you are reading now. 
It will give you an excellent starting point, and allow you to build this project again and/or play around until you feel comfortable doing deployments.</li>
</ul>


<% include '/WEB-INF/includes/footer.gtpl' %>
