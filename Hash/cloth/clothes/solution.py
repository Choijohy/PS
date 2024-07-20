def solution(clothes):
    result = 1

    # 해시 테이블 생성
    my_clothes = dict()
    for cloth in clothes:
        cloth_type = cloth[1]
        if cloth_type in my_clothes:
            my_clothes[cloth_type] = my_clothes[cloth_type] + 1
        else:
            my_clothes[cloth_type] = 1

    # 모든 의상 종류당 +1(안 입는 경우의 수 추가)
    for key in my_clothes.keys():
        my_clothes[key] = my_clothes[key] + 1
        # 경우의 수 곱하기
        result *= my_clothes[key]

    return result - 1



