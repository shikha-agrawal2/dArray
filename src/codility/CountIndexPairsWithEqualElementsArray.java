package codility;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//https://www.geeksforgeeks.org/count-index-pairs-equal-elements-array/
public class CountIndexPairsWithEqualElementsArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int length = A.length;
        for (int i = 0; i < length; i++) {
            if (hm.containsKey(A[i]))
                hm.put(A[i], hm.get(A[i]) + 1);
            else
                hm.put(A[i], 1);
        }
        int result = 0;

        for (Map.Entry<Integer, Integer> it : hm.entrySet()) {
            int count = it.getValue();
            result += (count * (count - 1)) / 2;
        }
        return result;

    }
}




//    constructor(props) {
//        super(props);
//        this.state = {
//                count: 100,
//                liked: false
//    };
//        this.btnClicked = this.btnClicked.bind(this);
//    }
//    btnClicked(e) {
//        if(this.state.liked){
//            this.setState({
//                    count:this.state.count-1,
//                    liked:false
//        });
//        }else{
//            this.setState({
//                    count:this.state.count+1,
//                    liked:true
//        });
//        }
//    }
//    render() {
//        let likeButtonClasses = "like-button"+(this.state.liked?"liked":"");
//        let like = "Like|";
//        return (
//                <button onClick={this.btnClicked} className={likeButtonClasses}>
//                {like}{this.state.count}
//      </button>
//    )
//    }


