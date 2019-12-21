package main.java.Stream.groupingBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestGroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<BlogPost> posts = populateBlogPost();
		Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType));
		
		Map<BlogPostType, Map<String, List<BlogPost>>> postsPerType2 = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType,Collectors.groupingBy(BlogPost::getAuthor)));
		
		Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor = posts.stream()
				  .collect(Collectors.groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));
		
		System.out.println();
		
		//3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);

	}

	private static List<BlogPost> populateBlogPost() {
		BlogPost bPost1 = new BlogPost("XXX", "Rahul", BlogPostType.GUIDE, 100);
		BlogPost bPost2 = new BlogPost("AAA", "Rajeev", BlogPostType.GUIDE, 100);
		BlogPost bPost3 = new BlogPost("ZZZ", "Arnab", BlogPostType.NEWS, 100);
		BlogPost bPost4 = new BlogPost("YYY", "Rahul", BlogPostType.GUIDE, 100);
		BlogPost bPost5 = new BlogPost("WWW", "Dhruv", BlogPostType.NEWS, 100);
		BlogPost bPost6 = new BlogPost("RRR", "Dhruv", BlogPostType.GUIDE, 100);

		List<BlogPost> posts = new ArrayList<BlogPost>();
		posts.add(bPost1);
		posts.add(bPost2);
		posts.add(bPost3);
		posts.add(bPost4);
		posts.add(bPost5);
		posts.add(bPost6);

		return posts;
	}

}
