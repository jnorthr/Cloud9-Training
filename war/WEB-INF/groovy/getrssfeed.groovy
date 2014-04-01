// define the url, change it to whatever rss url you like
def url = "http://blog.anynines.com/feed/"  //http://news.google.com/news?ned=us&topic=h&output=rss"

def feed = new XmlSlurper().parse(url) 
println "--------------------------------------\n"
println feed.channel.title
feed.channel.item.each {
    String pd = it.pubDate
    int at = (pd.indexOf('+') < 0) ? pd.size(): pd.indexOf('+'); 
    println "- ${it.title} on ${pd.substring(0,at-1)} click:${it.link}"
}
println "--------------------------------------\n"
