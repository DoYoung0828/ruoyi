import request from '@/utils/request'
import {Axios} from "axios";
import {queryDataIndex} from "echarts/types/src/util/model";

//查询
export function listproject(query) {
  return request({
      url:'/funds/project/list',
      method:'get',
      params:query

    }

  )
}

export function getProject(id){
  return request({
      url:'/funds/project/'+id,
      method:'get',
      //params:query

    }

  )
}
//添加
export function addProject(data){
  return request({
      url:'/funds/project/add',
      method:'post',
      data:data

    }

  )
}
//修改
export function updateProject(data){
  return request({
      url:'/funds/project/edit',
      method:'post',
      //params:query
      data:data

    }

  )
}
//删除
export function delProject(id){
  return request({
      url:'/funds/project/'+id,
      method:'delete',
    }

  )
}
